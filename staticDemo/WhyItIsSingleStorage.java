package staticDemo;

public class WhyItIsSingleStorage {

	int a = 5;
	static int b = 5;

	public static void main(String[] args) {

		WhyItIsSingleStorage staticDemo1 = new WhyItIsSingleStorage();

		System.out.println("staic >>" + WhyItIsSingleStorage.b++);
		System.out.println("non staic >>" + staticDemo1.a++);

		WhyItIsSingleStorage staticDemo2 = new WhyItIsSingleStorage();

		System.out.println("staic >>" + WhyItIsSingleStorage.b++);
		System.out.println("non staic >>" + staticDemo2.a++);

		WhyItIsSingleStorage staticDemo3 = new WhyItIsSingleStorage();

		System.out.println("staic >>" + WhyItIsSingleStorage.b++);
		System.out.println("non staic >>" + staticDemo3.a++);

		WhyItIsSingleStorage staticDemo4 = new WhyItIsSingleStorage();

		System.out.println("staic >>" + WhyItIsSingleStorage.b++);
		System.out.println("non staic >>" + staticDemo4.a++);
		
		/* 2nd way
		WhyItIsSingleStorage staticDemo1 = new WhyItIsSingleStorage();

		System.out.println("staic >>" + staticDemo1.b++);
		System.out.println("non staic >>" + staticDemo1.a++);

		WhyItIsSingleStorage staticDemo2 = new WhyItIsSingleStorage();

		System.out.println("staic >>" + staticDemo2.b++);
		System.out.println("non staic >>" + staticDemo2.a++);

		WhyItIsSingleStorage staticDemo3 = new WhyItIsSingleStorage();

		System.out.println("staic >>" + staticDemo3.b++);
		System.out.println("non staic >>" + staticDemo3.a++);

		WhyItIsSingleStorage staticDemo4 = new WhyItIsSingleStorage();

		System.out.println("staic >>" + staticDemo4.b++);
		System.out.println("non staic >>" + staticDemo4.a++);
		
		*/

	}

}
