package superKeyword;

public class Disha extends Ara{ // ara is parent/super class
	
	
	public Disha() {
		super();
		System.out.println("in Disha");
	}
	
	
	
	
	public  Disha(int num) {
		//super(num);
		System.out.println("1784748");
		
	}//  we put object that is why got result of line 15 and default constructor from super class that is ara class(ara class line 6).
	//super() is there by default. 
	

	public static void main(String[] args) {
		
		Disha obj2 =	new Disha(90);

	}

}
