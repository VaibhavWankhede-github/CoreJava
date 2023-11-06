package operatorsInJava;

public class LogicalOperator {

	public static void main(String[] args) {
		// Logical Operator
		// logical and &&
		// logical or ||

		// logical and example
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a < b && a < c);

		System.out.println("Logical and Results");
		System.out.println("true && true >>" + (true && true));
		System.out.println("true && false >>" + (true && false));
		System.out.println("false && true >>" + (false && true));
		System.out.println("false && false >>" + (false && false));

		System.out.println("Logical OR Results");
		System.out.println("true || true >>" + (true || true));
		System.out.println("true || false >>" + (true || false));
		System.out.println("false || true >>" + (false || true));
		System.out.println("false || false >>" + (false || false));

		System.out.println(a > b || a > c);

	}

}
