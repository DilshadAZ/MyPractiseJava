package myPractise1;

public class ConstructorPractise1  {
 String school ="Enthral";
	String name;
	int age;

	

	public  ConstructorPractise1(String name) {
		this.name = name;
		

	}

	public  ConstructorPractise1(String name, int age) {
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args) {
		
		
		ConstructorPractise1 obj = new ConstructorPractise1("Disha");
		System.out.println(obj.name);
		ConstructorPractise1 obj1 = new ConstructorPractise1("Disha", 90);
		System.out.println(obj1.age + obj.name);
		
	}

}