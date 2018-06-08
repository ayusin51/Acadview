import java.util.Scanner;
import static java.lang.Math.sqrt;

public class PrimeNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean ans = true;
		
		int range = (int)sqrt(num);
		for(int i = 2; i < range; i++)
		{
			if(num % i == 0)
			{
				ans = false;
				break;
			}
		}
		
		System.out.println("The number " + num + " is prime : " + ans);
	}
}
