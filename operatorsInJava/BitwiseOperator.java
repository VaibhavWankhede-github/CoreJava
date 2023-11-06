package operatorsInJava;

public class BitwiseOperator {

	public static void main(String[] args) {
		//Bitwise operator
		//& -> Bitwise and T & T -> T all are false
		//| ->Bitwise OR F | F -> F all are true 
		
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a < b & a < c);

		System.out.println("Bitwise and Results");
		System.out.println("true & true >>" + (true & true));
		System.out.println("true & false >>" + (true & false));
		System.out.println("false & true >>" + (false & true));
		System.out.println("false & false >>" + (false & false));

		System.out.println("Bitwise OR Results");
		System.out.println("true | true >>" + (true | true));
		System.out.println("true | false >>" + (true | false));
		System.out.println("false | true >>" + (false | true));
		System.out.println("false | false >>" + (false | false));

		System.out.println(a > b | a > c);

	}

}
