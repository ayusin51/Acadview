package FirstPackage;

public class Dog implements Animal {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
		System.out.println("Dog Speaking");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("Dog Eating");
		
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.speak();
		d.eat();
	}

}
