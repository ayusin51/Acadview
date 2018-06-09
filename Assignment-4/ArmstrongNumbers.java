import java.util.Scanner;

public class ArmstrongNumbers {

	public static int countDigit(int num) {
		
		int count = 0;
		while(num != 0) {
			
			count++;
			num /= 10;
		}
		return count;
	}

	public static int calc(int num) {
		
		int digit = countDigit(num);
		int sum = 0;
		while(num != 0) {
			
			sum += Math.pow(num%10, digit);
			num /= 10;
		}
		
		return sum;

	}

	public static void checkArmstrong(int num) {
		
		if(num == calc(num)) {
			
			System.out.println("Armstrong Number");
		}else {
		
			System.out.println("Not an Armstrong Number");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		checkArmstrong(num);
	}
	
}
