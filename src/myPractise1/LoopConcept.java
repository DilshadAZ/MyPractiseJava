package myPractise1;

public class LoopConcept {
// can u print your name 10 times?
	public static void main(String[] args) {
		/*
		 * int count=0; for(int i=0; i<10; i++) { System.out.println("Disha"); count =
		 * count+0; System.out.println(count); }
		 */
		/*
		 * int[] arr = {1,3,4,5,8,9,10}; for (int i=0; i<=arr.length; i++) {
		 * System.out.println(arr[i]); }
		 * 
		 * //print all the letters except i.
		 */

		/*String name = "Disha";
		for (int i = 0; i < name.length(); i++)
			if (name.charAt(i) == 's') {
//if (name.charAt(i)!='a') {
				System.out.println(name.charAt(i));
				{*/
	//print your name from the last(reverse)
			
		/*	//for (int i=5;i>=0;i--) 
			for (int i=name.length()-1;i>=0; i--)
			{
				System.out.print(name.charAt(i));
				
			}*/
		// print all the vowels of your name
		/*String name ="Zanionateu";
		int count =0;
			for (int i=0; i<name.length(); i++) {
				
				if(name.charAt(i)=='a'|| name.charAt(i)=='e'|| name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
						
			System.out.println(name.charAt(i));
			count = count+1;
			System.out.println(count);
}*/
		//Can you print the Z by writing the code?
		String name ="Zateuz";
		String name2=name.toLowerCase();
		for (int i=0; i<name2.length();i++) {
			if(name2.charAt(i)=='z' || name2.charAt(i)=='Z') {
				System.out.println(name2.charAt(i));
				StringBuffer  sb = new StringBuffer(name);
				System.out.println(sb.reverse());
				
		}
		
}
	}}
