package Strings;
import java.util.Scanner;

public class CheckOccuranceOfString {
	
	String str1, str2;
	
	public CheckOccuranceOfString() {
		
		Scanner sc = new Scanner(System.in);
		str1 = sc.nextLine();
		str2 = sc.nextLine();
	}
	
	public void check() {
		
		if(str1.indexOf(str2) != -1) {
			
			System.out.println("String 2 is present in string 1");
		}else {
			
			System.out.println("String 2 is not present in string 1");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckOccuranceOfString s = new CheckOccuranceOfString();
		s.check();

	}

}
