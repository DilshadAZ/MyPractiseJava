package OOP;

public interface ElectricFaciliity   {
	//Interface has 3 method. abstract , static and default
	
	void turnLight();// abstract method
	
	 static void turnOn() {} // we need static because it is more secured. 
	 
	 default void turnOff() {}
	

}
