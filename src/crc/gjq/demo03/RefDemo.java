package crc.gjq.demo03;

public class RefDemo {
	public void demo01() {
		Demo03 demo03 = new Demo03();
		System.out.println(demo03.getName());
	}

	public static void main(String[] args) {
		RefDemo demo = new RefDemo();
		demo.demo01();

	}
}
