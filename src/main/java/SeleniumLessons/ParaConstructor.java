package SeleniumLessons;

public class ParaConstructor {
	
	String animal_name;
	String animal_type;
	
	 ParaConstructor(String name,String type){
		animal_name=name;
		animal_type=type;
	}
	 
	public void sayAboutAnimal() {
		System.out.println("Animal name is "+animal_name+" and Type is "+animal_type);
	}

	public static void main(String[] args) {
		
		ParaConstructor animal1 = new ParaConstructor("Deer", "Plant Eater");
		animal1.sayAboutAnimal();
		
		// TODO Auto-generated method stub

	}

}
