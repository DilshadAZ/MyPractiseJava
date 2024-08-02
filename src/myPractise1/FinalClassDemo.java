package myPractise1;

public class FinalClassDemo {

	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.show2();
		obj.show(4, 6);

	}
}
	
	/*
	
	class AdvancedShow extends Demo{ // as i am making this class final, noone is able to use the class, and also onone inherit the class.that is why line nmber12 is showing error
}
	final class  Demo{ 
	
		
		public void show(int a, int b) {

			System.out.println(a + b);
		}

		public void show2() {

			System.out.println("x:my name");
	}

}*/
