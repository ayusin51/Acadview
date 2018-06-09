import java.util.Scanner;
import static java.lang.Math.sqrt;

public class PrimeNum {

	public static boolean checkPrime(int num) {
	
		boolean ans = true;
		
		if(num == 1) return false;
		
		int range = (int)sqrt(num);
		for(int i = 2; i < range; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	} 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean ans = checkPrime(num);
		
		System.out.println("The number " + num + " is prime : " + ans);
	}
}
