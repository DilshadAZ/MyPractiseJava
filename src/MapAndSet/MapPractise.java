package mapAndSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractise {

	public static void main(String[] args) {
		 Map<Integer,String> map = new HashMap();
		 map.put(01, "Disha");
		 map.put(02, "Dhaka");
		 map.put(03, "Artist");
		 map.put(04, "Disha");
		
		 
		// System.out.println(map.size());
		// System.out.println(map.get("name"));
		 
		//Set <Integer> keys= map.keySet();
		
		for (int k:map.keySet()) {
			
			System.out.println(map.get(k));// get method is used in Map only. Map gives duplicate values.
		}

	}

}
