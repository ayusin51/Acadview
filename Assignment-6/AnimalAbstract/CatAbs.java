package FirstPackage;

public class CatAbs extends Animals {
	
	void eat() {
		
		System.out.println("Cat is eating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CatAbs c = new CatAbs();
		c.speak();
		c.eat();

	}

}
