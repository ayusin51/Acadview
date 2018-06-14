package FirstPackage;

public class Cat implements Animal {
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
		System.out.println("Cat Speaking");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("Cat Eating");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat c = new Cat();
		c.eat();
		c.speak();
	}

}
