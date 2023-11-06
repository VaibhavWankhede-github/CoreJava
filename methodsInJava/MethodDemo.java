package methodsInJava;

public class MethodDemo {

	// void is return type
	// getExample is function name
	void getExample() {
		System.out.println("This is Method");
	}

	// int is return type
	int getExample2() {
		return (10 + 20);

	}

	// String is return type
	String getExaple3() {
		return "vaibhav";
	}

	public static void main(String[] args) {
		MethodDemo methodDemo = new MethodDemo();
		methodDemo.getExample();
		System.out.println("Addition of 10+20 " + methodDemo.getExample2());
		System.out.println("Hello  " + methodDemo.getExaple3());
	}

}
