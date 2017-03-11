package crc.gjq.demo03;

public class Demo03 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Demo03() {
		super();
	}

	public Demo03(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Demo03 [name=" + name + ", age=" + age + "]";
	}

}
