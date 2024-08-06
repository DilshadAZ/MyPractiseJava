package collectionFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractise {

	public static void main(String[] args) {
		
	/*	Set<Integer> set = new TreeSet<Integer>(); // treeset gives sorted values ,lower to upper
		set.add(50);
		set.add(60);
		set.add(80);
		set.add(60);
		for (int n :set) {
			System.out.println(n); // set and also treeset do not give duplicate value. it prints only unique value.
			
			*/
			Set <String> set1 = new HashSet();
			set1.add("Disha");
			set1.add("Irisha");
			set1.add("Disha");
			set1.add("Zuhaira");
			set1.add("Tania");
			set1.add("Irisha");
			
			
			
			for (String number:set1)
				
				System.out.println(number);
			
			
			
			
	}

	}


