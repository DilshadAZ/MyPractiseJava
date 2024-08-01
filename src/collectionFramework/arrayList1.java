package collectionFramework;

import java.util.ArrayList;

public class arrayList1 {

	public static void main(String[] args) {
		int [] ids= new int[4];
		ids [0]= 89;
		ids [1]=90;
		ids[2]=80;
		ids [3]=60;
	
		
		System.out.println(ids[3]);
	
		ArrayList name = new ArrayList ();
		name.add("AAA");
		name.add("BBB");
		name.add("CCC");
		name.add("DDD");
		System.out.println(name.get(3));
		System.out.println(name.get(name.size()-2));
		System.out.println(name);
		System.out.println("The size of the ArrayList is " + name.size() + "\n");
		

	}

}
