package LoopPractise;

public class transformStringWordByWord {

	public static void main(String[] args) {
		String words = "Dilshad Zannat";
		transformStrinToWord(words);
		

	}
 public static void transformStrinToWord(String words) {
	 
	  String[] transform = words.split(" ");
	  for (int i =transform.length -1;i>=0; i--) {
		  
		  System.out.print(transform[i] +" ");
	  }
	  
	 
 }
}
