package encapsulation;

import java.util.Scanner;

public class Student {
	private int studentid;
	private String studentname;
	private String studentcity;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentcity() {
		return studentcity;
	}

	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student id : ");
		int id = scanner.nextInt();
		System.out.println("Enter Student name : ");
		String name = scanner.next();
		System.out.println("Enter Student city : ");
		String city = scanner.next();
		Student student = new Student();
		student.setStudentid(id);
		student.setStudentname(name);

		student.setStudentcity(city);
		System.out.println(student.getStudentid());
		System.out.println(student.getStudentname());
		System.out.println(student.getStudentcity());


	}

}
