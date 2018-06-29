import java.util.Scanner;

public class EvenNumbers {

	public static boolean isEven(int num) {
		
		if(num % 2 == 0)
			return true;
		return false;
	}

	public static void printEven(int num) {
		
		for(int i = 1; i <= num; i++)
		{
			if(isEven(i))
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		printEven(num);
	}
	
}
