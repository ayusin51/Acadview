import java.util.Scanner;

public class GreatestOfThree {

	public static int Greatest(int num1, int num2, int num3) {
		
		return (num1 > num2)?((num1 > num3)? num1: num3):((num2 > num3)? num2 : num3);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int greatest = Greatest(num1, num2, num3);
		
		System.out.println("Greatest number is : " + greatest);
	}
}
