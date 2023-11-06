package staticDemo;

public class StaticAndNonStaticMethods {
	
	void x1() {
		System.out.println("This is the non static Method ... ");
		x2();
	}

	static void x2() {
		System.out.println("this is static method....");
		//x1(); we cant call non static method into static method
	}
	public static void main(String[] args) {
		
		StaticAndNonStaticMethods obj=new StaticAndNonStaticMethods();
		obj.x1();
	}

}
