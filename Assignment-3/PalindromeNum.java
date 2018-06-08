import java.util.Scanner;

public class PalindromeNum {

	public static boolean palindrome(int num) {
	
		int temp = num;
		int rev = 0;
		while(temp != 0) {
			
			rev = rev*10 + temp % 10;
			temp /= 10;
		}
		
		return (rev == num);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean ans = palindrome(num);
		
		System.out.println("The number " + num + " is palindrome : " + ans);
	}
}
