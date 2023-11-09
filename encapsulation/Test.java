package encapsulation;

public class Test {
	public static void main(String[] args) {
		Person myObj = new Person();
		// myObj.name = "John"; // error
		// System.out.println(myObj.name); // error
		myObj.setName("Vaibhav"); // Set the value of the name variable to "John"
		System.out.println(myObj.getName());

	}

}
