package constructorInJava;
//Program for default constructor
public class Test {
	String name;
	//This is default constructor
		Test(){
			name="Vaibhav";
			System.out.println("It is Constructor....");
		}
	public static void main(String[] args) {
		Test test=new Test();// Calling or invoked constructor
		
		System.out.println(test.name);
	}

}
