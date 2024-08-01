package myPractise1;

public class Newpractise {

	static  String name;
	static String School = "ABC School";
    int age = 60;
	

	

	public static void main(String[] args) {
		
		
		Newpractise obj1 = new Newpractise("Aruhul");
		
		obj1.method();
		
		Newpractise obj = new Newpractise("Raania");
		obj.method();

		
		System.out.println(obj.name);
		System.out.println(School);
	System.out.println(obj1.name);

	
	}
	
	public Newpractise(String name ) {
		String ba= "nahi";
		this.name = name;
		System.out.println(School);
		
		
	}

	public void method() {

		System.out.println(School +"-"+ name+ "-" +age);

	}
}
