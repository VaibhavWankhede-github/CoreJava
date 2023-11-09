package Inheritance;

//Parent class
class One {
	public void printOne() {
		System.out.println("This is one Class Method");
	}
}

class Two extends One {
	public void printTwo() {
		System.out.println("This is Two Class Method");
	}
}

public class SingleInheritanceDemo {
	public static void main(String[] args) {
		Two two=new Two();
		two.printTwo();
		two.printTwo();
	}
}
