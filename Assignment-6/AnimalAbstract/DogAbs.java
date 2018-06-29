package FirstPackage;

public class DogAbs extends Animals {
	
	void eat() {
		
		System.out.println("Dog is eating");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DogAbs d = new DogAbs();
		d.eat();
		d.speak();

	}

}
