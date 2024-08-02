package myPractise1;

class Demo2 {
	public void show(int a, int b) {
		System.out.println(a + b);
	}

	public final  void  show2() {
		System.out.println("x:my name");
	}
}

/*
class AdvancedShow extends Demo {
	
	public  void show2() {// cant make the method as i declare final in line number 8. noone can use the method
	System.out.println("You are good");
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		AdvancedShow obj = new AdvancedShow();
		obj.show(5, 4);
		obj.show2();
	}
*/

