public class Animal {
    
    String breed, color;
    
    void speak() {
        
        System.out.println("I am an Animal");
    }
}

class Dog extends Animal {
    
    @Override
    void speak() {
        
        System.out.println("I am a Dog");
    }
}

class Cat extends Animal {
    
    @Override
    void speak() {
        
        System.out.println("I am a Cat");
    }
}

public class Main
{
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		animal.speak();
		dog.speak();
		cat.speak();
	}
}
