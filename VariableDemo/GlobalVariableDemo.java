package VariableDemo;

public class GlobalVariableDemo {

	int a;// Declare Global variable

	int b = 100;// initialize global variable
	boolean flag;
	float fvar;
	double dvar;

	public static void main(String[] args) {
		GlobalVariableDemo globalVariableDemo = new GlobalVariableDemo();
		System.out.println("Value of b variable >> " + globalVariableDemo.b);
		System.out.println("Value of a  variable  before assign value>> " + globalVariableDemo.a);// when you can not
																									// assign value then
																									// show default
																									// value
		globalVariableDemo.a = 10;
		System.out.println("Value of a variable after assign value >> " + globalVariableDemo.a);
		System.out.println(globalVariableDemo.flag);// false - default value
		System.out.println(globalVariableDemo.fvar);// 0.0 -default value
		System.out.println(globalVariableDemo.dvar);// 0.0 - default value

	}

}
