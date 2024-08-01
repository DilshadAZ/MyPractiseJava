package myPractise1;

public class ConstructorPractise {
	String name;
	int age;
	

	

	public ConstructorPractise() {

	}

	public ConstructorPractise(String name) {
		this.name=name;
	}

	public ConstructorPractise( String name, int age) {

		this.age= age;
		this.name = name;
		
	}
	public static void main(String[] args) {
		ConstructorPractise	obj= new ConstructorPractise();
		System.out.println(obj.name);
		
		ConstructorPractise	obj1= new ConstructorPractise("Disha");
		System.out.println(obj1.name);
		
		ConstructorPractise	obj3= new ConstructorPractise("Disha" , 80);
		System.out.println( obj1.name + obj3.age);
		
		
	}
}
