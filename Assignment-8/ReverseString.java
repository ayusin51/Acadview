package Strings;
import java.util.Scanner;

public class ReverseString {
	
	static String reverse(String str) {
		
		String rev = "";
		int len = str.length();
		for(int i = len-1; i >= 0; i--) {
			
			rev += str.charAt(i);
		}
		return rev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Reverse is " + reverse(str));

	}

}
