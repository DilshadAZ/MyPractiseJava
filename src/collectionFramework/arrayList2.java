package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList2 {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		//List<String> name = new ArrayList<String>();
	name.add(0, "NY");
	name.add(1, "JY");
	//name.add(null);
	name.add(2, "KY");
	name.add("CY");
	name.add(4, "OY");
//	name.add("CY");
	name.add( "TY");
	//name.add(null);
	name.add(6, "SY");
	//name.add(null);
	//name.add(null);
	name.add(7, "AY");
	name.add(6, "LY");
	name.set(0, "Allll");
	
	/*System.out.println(name.get(0));
	System.out.println(name);
	System.out.println(name.get(5));
	System.out.println(name.get(4));
	System.out.println(name.size());
	//System.out.println(name.get(9));
	System.out.println(name.addAll(name));
	*/
	ArrayList <String> name2 = new ArrayList<>();
	name2.add("Hawaii");
	name2.add("Alaska");
	name2.add("Washington");
	//name2.clear();
	name2.removeAll(name2);
	
	/*System.out.println(name.addAll(name2));
	System.out.println(name.remove(5));
	System.out.println(name2.contains("Anaika"));
	System.out.println(name2.contains(name));*/
	//name2.retainAll(name);
	System.out.println(name2);
	Collections.sort(name2);
	System.out.println(name2);
	Collections.sort(name2, Collections.reverseOrder());
	System.out.println(name2);
	

	}

}
