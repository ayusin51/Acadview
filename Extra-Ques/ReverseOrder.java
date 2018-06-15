package Strings;
import java.util.Scanner;

public class ReverseOrder {
	
	String str;
	
	public ReverseOrder() {
		// TODO Auto-generated constructor stub
		
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
	}
	
	public void reverse() {
		
		String word = "";
		String rev = "";
		for(int i = str.length()-1; i >= 0; i--) {
			
			if(str.charAt(i) == ' ') {
				rev = rev + " " + word;
				word = "";
			}else {
				word = str.charAt(i) + word;
			}
		}
		rev = rev + " " + word;
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseOrder s = new ReverseOrder();
		s.reverse();

	}

}
