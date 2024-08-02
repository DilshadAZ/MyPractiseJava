package loopPractise;

public class VowelsInString {

	public static void main(String[] args) {
		String name ="Dilsheadio";
		name= name.toLowerCase();
		
		int count=0;
		
		for (int i=0;i<name.length(); i++) {
			
		if (name.charAt(i)=='a'||name.charAt(i)=='i' || name.charAt(i)=='o' ||name.charAt(i)=='u' ||name.charAt(i)=='e') {
				//System.out.println(name.charAt(i));	
		count++;
		}}
		System.out.println("total vowel is" + count);
		}}

	
		
