import java.util.Scanner;

public class ReverseNum {

	public static int reverse(int num) {
	
		int rev = 0, temp = num;
		while(temp != 0) {
			
			rev = rev*10 + temp % 10;
			temp /= 10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int rev = reverse(num);
		
		System.out.println("The reverse of " + num + " is " + rev);
	}
}
