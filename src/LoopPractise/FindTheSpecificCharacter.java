package LoopPractise;

public class FindTheSpecificCharacter {

	public static void main(String[] args) {

		String name = "SaameaunsKhaliod";
		findTheSpecificLetter(name);
	}

	public static void findTheSpecificLetter(String name) {

		int count = 0;
	//	name = name.toLowerCase();
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'o'|| name.charAt(i) == 'i'|| name.charAt(i) == 'u')
				
				// System.out.println(name.charAt(i));
				
			count++;}
			System.out.println("Total vowel are " + count);
		}
	}
