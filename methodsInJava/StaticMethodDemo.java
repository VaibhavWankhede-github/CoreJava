package methodsInJava;

public class StaticMethodDemo {

	static void getEx() {
		System.out.println("this is static method");
	}

	public static void main(String[] args) {
		// call static method using 2way
		// 1 way
		StaticMethodDemo.getEx();

		// 2 way is not prefer its give a warnig
		StaticMethodDemo staticMethodDemo = new StaticMethodDemo();
		staticMethodDemo.getEx();

		// 3rd way
		getEx();
	}

}
