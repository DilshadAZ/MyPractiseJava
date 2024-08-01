package myPractise1;

public class StaticNonstatic {

	// static String name;
	String name;
	String School = "ABC IT";

	public static void main(String[] args) {

		StaticNonstatic obj1 = new StaticNonstatic();
		obj1.name = "Ruhul";

		System.out.println(obj1.Addnumber(12, 10, 10));

		System.out.println(obj1.Addnumber(12, 10));

		StaticNonstatic obj2 = new StaticNonstatic();
		obj2.name = "Tania";

		System.out.println(obj1.name);
		System.out.println(obj2.name);
		countallDigit(10);

	}

	public StaticNonstatic() {
		this.name = name;
	}

	public int Addnumber(int n, int n1) {
		int sum = n + n1;
		return sum;

	}

	public int Addnumber(int n, int n1, int n3) {
		int sum = n + n1 + n3;
		return sum;

	}
 public int Addtosum(int...n) {
	 int sum =0;
	 for (int s:n ) {
	  sum = sum+s;
 }
	 return sum;
 }
	 public static void countallDigit(int n) {
		 int sum =0;
		 for (int i=1;i<n; i++) {
			 sum =sum+i;}
		 System.out.println(sum);
}
		 
		 
	 }
	 
 
 
