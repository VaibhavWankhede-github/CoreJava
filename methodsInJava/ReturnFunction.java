package methodsInJava;

public class ReturnFunction {

	String getStudentName(String name) {
		return name;
	}

	public static void main(String[] args) {
		ReturnFunction returnFunction = new ReturnFunction();
		System.out.println("1 Stuedent name" + returnFunction.getStudentName("Vaibhav"));
		System.out.println("2 Stuedent name" + returnFunction.getStudentName("Gaurav"));
		System.out.println("3 Stuedent name" + returnFunction.getStudentName("Ajay"));

	}

}
