package myPractise1;

public class StringManipulation {

	public static void main(String[] args) {
		String name = "DILSHAD";
		int total = name.length();
		//String fullname = name.concat(" Zannat");
		//System.out.println(fullname);
		System.out.println(name.charAt(5));
		System.out.println(name.substring(0, 5));//5 number index does not count
		System.out.println(name.substring(4, 6));// 6 number index does not count
		System.out.println(name.substring(total-4, 6));
		
		
		char[]letter = new char[7];
		letter [0]='D';
		letter [1]='I';
		letter [2]='L';
		letter [3]='S';
		letter [4]='H';
		letter [5]='A';
		letter [6]='D';
		//System.out.println(letter[3]);
		
		//for (int i=1;i<=letter.length-1;i++) {
		//	System.out.println(letter[i]);
		//int count =0;
		//for (int i =1; i<102;i++) {
		//	System.out.println("DILSHAD");
		//	count =count+1;
		
	//	System.out.println(count);
		
		String name1= "Zannat";
		
		for (int i =name1.length()-1; i>=0;i--) {
			System.out.println(name1.charAt(i));
		}
}
}
