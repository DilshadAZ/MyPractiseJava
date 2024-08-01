package collectionFramework;

import java.util.Arrays;

public class seconndLargestAnd2ndLowest {

	public static void main(String[] args) {
		int [] num = {20,10,40,60,90,30};
		System.out.println(Arrays.toString(num));
		int tempp =0;
		
		for (int i =0;i<num.length; i++){
			
			for (int j= i+1; j<num.length; j++) {
				if (num[i]>num[j]) {
					 tempp = num[i];
					 num[i]=num[j];
					 num[j]=tempp;
					
			}
			}
		}
		System.out.println(Arrays.toString(num));
		System.out.println(num[0]);
		System.out.println(num[num.length-1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		
		 int[] list = {3,6,7,14,10,40,80,20,12};
		 System.out.println(Arrays.toString(list));
		  //int lowest = list[0];
		  //int highest =list [0];
		  int temp=0;
		  
		  for (int i=0;i<list.length;i++ ) {
			  for (int j=i+1;j<list.length;j++) {
			  
			  if (list [i] < list [j]) {
				  temp = list[i];
				  list [i] = list [j];
				  list[j] = temp;
				  
			  }}}
		  System.out.println(Arrays.toString(list));
		  System.out.println(list[list.length-2]);//2nd smallest*/
	}
			  
}	    

	

