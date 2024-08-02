package loopPractise;

public class ReverseSumofTwoNumber {

	public static void reverseSumofTwoNumbers(int sum) {
		String s = String.valueOf(sum);
		for (int i= s.length()-1;i>=0; i--) {
			System.out.print(s.charAt(i));
		}}
		public static void main(String[] args) {
			
			int a = 80;
			int b = 90;
			int sum = a+b;
			reverseSumofTwoNumbers(sum);
		}
		
	}


