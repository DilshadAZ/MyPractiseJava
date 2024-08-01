package myPractise1;



public class ReverseVertically {
	
	
	
/*	public static void reverseVertically(String S) {
		String rs ="";
		for (int i=S.length()-1; i>=0;i--) {
			rs= rs.concat(String.valueOf(S.charAt(i)));
		}
			System.out.println(rs);

			
		}*/
	
	public static String reverseVertically1(String S) {
		String rs ="";
		for (int i=S.length()-1; i>=0;i--) {
			rs= rs.concat(String.valueOf(S.charAt(i)));
		}
			return rs;
		
		//StringBuffer name =new StringBuffer(S);
		//System.out.println(name.reverse());
		
	}
	
	public static void main(String[] args) {
	System.out.println(reverseVertically1("Fatema"));	
		//ReverseVertically("Disha");

	}

}
