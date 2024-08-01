package OOP;

public class Cars extends Truck implements ElectricFaciliity, Design{
 static String Model= "Unique";
 static String limit = "Max";
 static String Size= "JU";
 static int limit1 =90;
 
	public static void main(String[] args) {
		Cars obj = new Cars ();
		obj.printInfo();
		obj.printInfo3();
		obj.printInfo3(limit);
		obj.printInfo3(limit, limit1);
		
		
	}
	public static void printInfo() {
		
	System.out.println("MOdel" + " " + Model);
	}
	 void printInfo3() {
		//System.out.println("");
		
	}
	
	 void printInfo3(String limit) {
		System.out.println(limit);
	
	}
	 void printInfo3(String limit, int limit1) {
		System.out.println("drives maximum"+ " " + limit + limit1);
	}
	@Override
	public void designBlack() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void turnLight() {
		// TODO Auto-generated method stub
		
	}

}
