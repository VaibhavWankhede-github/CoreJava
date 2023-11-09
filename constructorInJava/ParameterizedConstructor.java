package constructorInJava;

public class ParameterizedConstructor {
	  int sid;
	  String sname;
	  String scity;
	
	ParameterizedConstructor(int id, String name, String city){
		sid=id;
		sname=name;
		scity=city;
		
	}

	public static void main(String[] args) {
	ParameterizedConstructor parameterizedConstructor=new ParameterizedConstructor(1, "Vaibhav", "Muktainagar")	;
	System.out.println(parameterizedConstructor.sid);
	System.out.println(parameterizedConstructor.sname);
	System.out.println(parameterizedConstructor.scity);

	}

}
