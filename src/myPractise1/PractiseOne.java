package myPractise1;

public class PractiseOne {
	
	static String name1 = "Zan Nat";
	  String cnamw = "Tania";
	//*public static void main(String[] args) {
		//String name = "zann";
		//PractiseOne name2 = new PractiseOne();
		
		
		//System.out.println(name2.cnamw);
		
	//}
	
	String name;
	static String School = "ABC School";
    int age;
	

	

	public static void main(String[] args) {
		PractiseOne obj = new PractiseOne(30);
		obj.method();
		//int b =20;
		//int c =33;
		//int v = b+c;
		//System.out.println(v);
	int	sum = obj.addtocart(10, 12);
		//System.out.println(sum);
		
		PractiseOne obj1 = new PractiseOne(300);
		obj1.method();
		

		System.out.println(obj1.age);
		System.out.println(obj.age);
		System.out.println(School);

	
	}
	
	public PractiseOne(int age ) {
		this.age = age;
		
		
	}

	public void method() {

		System.out.println(School +"-"+ age);

	}
	public int addtocart(int ab, int bg) {
		int summm= ab+bg;
		return summm;
		

}
}