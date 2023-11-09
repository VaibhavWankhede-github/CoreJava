package constructorInJava;

public class ConstructorOverloading {
	int id;
	String name;

	public ConstructorOverloading() {
		System.out.println("This is Default or non parameterise constructor");
		id = 1;
		name = "Vaibhav";
	}

	public ConstructorOverloading(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(" This is the parameterise constructor with agrument");
	}

	public static void main(String[] args) {
		ConstructorOverloading constructorOverloading = new ConstructorOverloading();
		System.out.println(constructorOverloading.id);
		System.out.println(constructorOverloading.name);

		ConstructorOverloading constructorOverloading1 = new ConstructorOverloading(2, "Ajay");
		System.out.println(constructorOverloading1.id);
		System.out.println(constructorOverloading1.name);

	}

}
