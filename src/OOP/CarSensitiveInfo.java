package OOP;

public class CarSensitiveInfo {
	
	//Encapsulation. we hide information and that is why we put private.
	//we use getter setter method and we will use in other class
	private String chesis="Unique Chesis";
	private int vin;
	private String EnengineID;
	
	
	public int getVin() {
		return vin;
	}
	public void setVin(int vin) {
		this.vin = vin;
	}
	public String getEnengineID() {
		return EnengineID;
	}
	public void setEnengineID(String enengineID) {
		EnengineID = enengineID;
	}
	public String getChesis() {
		return chesis;
	

}
}
