package OOP;

public class Toyota extends Cars implements Design, ElectricFaciliity{

	
	static int year =20;
	
	public static void main(String[] args) {
	//System.out.println(year);
	//System.out.println(Model);
	//printInfo();
	//printTruckInfo();
	Toyota obj = new Toyota();
	//obj.printInfo3(Model);
	//obj.printInfo3(Model, year);
	obj.printInfo3(limit, limit1);
	obj.printInfo3(limit);
	obj.frontSensor();
	
	//Encapsulation
	
	CarSensitiveInfo obj1= new CarSensitiveInfo();
	obj1.setEnengineID("njn09090");
	obj1.setVin(90);
	//obj1.getEnengineID();
	System.out.println(obj1.getChesis());// we only get chesis as we did the getter method, not the setter method.
 
	
	
	
		
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
