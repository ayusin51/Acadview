import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person {
	
	String name;
	Integer age;
	
	public Person(String s, Integer i) {
		// TODO Auto-generated constructor stub
		
		name = s;
		age = i;
		
	}
	
	public static Comparator<Person> compByName = new Comparator<Person>() {
		
		public int compare(Person p1, Person p2) {
			
			return p1.name.compareTo(p2.name);
		}
		
	};
	
	public static Comparator<Person> compByAge = new Comparator<Person>() {
		
		public int compare(Person p1, Person p2) {
			
			return p1.age-p2.age;
		}
		
	};
	
	
	public String toString() {
		
		return "[ Name : " + this.name + "; Age : " + this.age + "]\n";
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Person> s = new ArrayList<Person>();
		s.add(new Person("Ayush", 19));
		s.add(new Person("Guneet", 20));
		s.add(new Person("Peeyush", 21));
		s.add(new Person("Gitesh", 12));
		s.add(new Person("Ankush", 22));
		s.add(new Person("Aryan", 17));
		
		System.out.println("Sorted By Age");
		Collections.sort(s, compByAge);
		
		for(Person p : s) {
			System.out.println(p);
		}
		
		System.out.println("Sorted By Name");
		Collections.sort(s, compByName);
		for(Person p : s) {
			System.out.println(p);
		}
	}

}
