package SeleniumLessons;

public class CoffeeBreak {
	
	//boolean variable is a data type, it’ll return true or false. 
	//Boolean written in this format is addressed as Wrapper Class
	//boolean written in this format is addressed as primitive data type. 

	boolean isCupEmpty = true;
	
	public static void main(String[] args) {
		
		CoffeeBreak coffee = new CoffeeBreak();
		
		if(coffee.isCupEmpty) { //true
			System.out.println("Fill the Cup");
		} else{
			System.out.println("Drink the Coffee");
		}
		

	}

}
