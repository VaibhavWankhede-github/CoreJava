package staticDemo;

public class AccessInSameClass {

	static int a; //Declaration of Static Variable
	static int b=30; // Initialization of static variable
	
	public static void main(String[] args) {
		System.out.println("calling by using class name >> "+AccessInSameClass.b); //1 st way
		
		AccessInSameClass obj=new  AccessInSameClass(); //  this is  bad practice
		
		System.out.println("calling by using object >> "+obj.b);// 2 nd way

	}

}
