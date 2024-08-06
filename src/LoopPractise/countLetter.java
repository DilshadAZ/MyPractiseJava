package loopPractise;

public class CountLetter {

	public static void main(String[] args) {
		String name  ="DilddddDDDDshiiiad";
		 countLetter(name);
		
		

	}
 public static void countLetter(String name) {
	 int count =0;
	 
	/* for (int i=0; i<name.length();i++) {
		 if (name.charAt(i)!='D'&  name.charAt(i)!='d' &  name.charAt(i)!='i') {
			 count++;
		 }}
			 System.out.println("other letter except d and i " + count);
		*/	 
		for (int i=0; i<name.length(); i++) {
			
			if ( name.charAt(i)=='D' || name.charAt(i)=='d' || name.charAt(i)=='i') {
				count++;
			}
		}
			 System.out.println("total d and I " + count);
			 
		 }
	 
	 
	 
}
