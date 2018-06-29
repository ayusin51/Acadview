import java.util.Scanner;

public class PrimeNumbers {

	public static boolean isPrime(int num) {
	
		if (num == 1) return false;
		
		for(int i = 2; i <= Math.sqrt(num); i++)
		{
			if(num % i == 0) return false;
		}
		return true;

	}

	public static void printPrime(int num) {
		
		for(int i = 1; i <= num; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		printPrime(num);
	}
	
}
