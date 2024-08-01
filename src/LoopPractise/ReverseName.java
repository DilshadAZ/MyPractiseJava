package LoopPractise;

public class ReverseName {

	public static void main(String[] args) {
		String name = "Dilshad Zannat";
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}

		String[] words = name.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}
}