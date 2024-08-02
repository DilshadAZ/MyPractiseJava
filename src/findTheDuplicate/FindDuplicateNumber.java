package findTheDuplicate;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		int[] num = { 8, 15, 30, 45, 38, 90, 30, 20, 8, 90, 90, 15 };
		Set<Integer> duplicateNumber = new HashSet<Integer>();

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {

				if (num[j] == num[i]) {
					duplicateNumber.add(num[i]);
				}
			}

		}
		System.out.println(duplicateNumber);

	}

}
