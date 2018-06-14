package FirstPackage;
import java.util.Scanner;

public class GreatestOfTwo {
	
	private String num1, num2;
	
	void input() {
		
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextLine();
		num2 = sc.nextLine();
		
	}
	
	int greatest() {
		
		return (Integer.parseInt(num1) > Integer.parseInt(num2) ? Integer.parseInt(num1) : Integer.parseInt(num2));
	}
	
	public static void main(String[] args) {
		
		GreatestOfTwo obj = new GreatestOfTwo();
		obj.input();
		System.out.println("Greatest is " + obj.greatest());
	}

}
