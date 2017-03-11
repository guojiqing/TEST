package crc.gjq.demo01;

/*
 * 第一次提交
 * 
 * 第三次提交 
 */

// 反射可以在运行时的时候动态获取class文件，从而进一步获取class里面的所有信息
public class Demo01 {

	public Demo01(){
		System.out.println("==Demo01==");
	}
	public static void main(String[] args) throws Exception {
		// *.java *.class runtime
		//System.out.println(Demo01.class);
		//System.out.println(new Demo01().getClass());
		System.out.println(Class.forName("crc.gjq.demo01.Demo01").newInstance());
		
	}
}
