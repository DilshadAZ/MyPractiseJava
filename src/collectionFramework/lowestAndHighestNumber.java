package collectionFramework;

public class lowestAndHighestNumber {

	public static void main(String[] args) {
		
		int [] list = {90,30,40,60,10,20};
		
		int lowest =list [0];
		int highest = list [0];
		
		for (int i =0;i<list.length; i++) {
			if (list[i] < lowest) {
				lowest = list[i];
			}else if (list[i]>highest){
				highest = list[i];
			}
			
		}
			System.out.println(lowest);
			
			System.out.println(highest );
			
			
		
		
		
		
		
		/*int[] list = { 2, 8, 9, 4, 50, 60, 26, 62 };
		int lowest = list[0];
		int highest = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i] < lowest) {
				lowest = list[i];
			} else if (list[i] > highest) {
				highest = list[i];
			}

		}
		// int sum = lowest + highest;
		System.out.println(lowest);
		System.out.println(highest);
		// System.out.println(highest);
		// System.out.println(sum);
*/
	
}}
