package operatorsInJava;

public class UnaryOperators {

	public static void main(String[] args) {
		// UnaryOperator
		// ++ increment
		// -- decrement

		// post incremet
		int a = 10;
		System.out.println(a++); //10
		System.out.println(a++); //11

		// post decrement
		int b = 20;
		System.out.println(b--);//20
		System.out.println(b--);//19

		// pre incremet
		a = 10;
		System.out.println(++a);//11
		System.out.println(++a);//12

		// pre decrement
		b = 20;
		System.out.println(--b);//19
		System.out.println(--b);//18

	}

}
