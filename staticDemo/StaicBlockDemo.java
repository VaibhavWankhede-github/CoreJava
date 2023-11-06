package staticDemo;

public class StaicBlockDemo {
// It will execute sequence wise	
	int a=10;

	static {
		//StaticBlockDeno.a; we can not access the non static member variable in static block
		System.out.println("In the static Block..... ");
	}
	
	static {
		System.out.println("This is 2nd Static Block....");
	}
	static {
		System.out.println("This is 3rd Static Block...");
	}
	public static void main(String[] args) {
		System.out.println("In the Main Method ");
	}

}
