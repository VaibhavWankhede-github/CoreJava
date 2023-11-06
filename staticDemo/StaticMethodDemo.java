package staticDemo;

public class StaticMethodDemo {

	static void x2() {
		System.out.println("this is static method ");
	}
	
	public static void main(String[] args) {
		//3 way to call static  method
		
		//1 st way using class name
		
		StaticMethodDemo.x2();
		
		//2nd way using object
		
		StaticMethodDemo obj=new StaticMethodDemo();
		obj.x2(); // As we descusss above program  this is bad practice
		
		//3rd way direct call
		
		x2(); 	
	}

}
