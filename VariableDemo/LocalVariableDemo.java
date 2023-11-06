package VariableDemo;

public class LocalVariableDemo {

	public static void main(String[] args) {

		int c;// declaration of local var
		int a = 10;// initialization of varible

		// how to print value of local varibale
		System.out.println("variable a >>" + a);

		// local variable dose not initialize automatically

		// System.out.println("variable c >>"+c);// here they give error at compile time
		// - the local variable c may not been initialized
	}

}
