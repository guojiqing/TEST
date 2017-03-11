package crc.gjq.demo02;
 
import java.io.InputStream;
import java.util.Properties;

public class DaoFactory {
	private static InputStream in;
	private static Properties prop = null;
	static {
		in = DaoFactory.class.getResourceAsStream("/pro.properties");
		prop = new Properties();
		try {
			prop.load(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public static IDao getDao() {
		try {
			return (IDao) Class.forName(prop.getProperty("dao1")).newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public static void main(String[] args) {
		IDao dao = DaoFactory.getDao();
		dao.save();
	}
}
