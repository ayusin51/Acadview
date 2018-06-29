import java.util.Scanner;

public class AddTwoNumbers {

	public static int Add(int a, int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = Add(num1, num2);
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
	}
}
