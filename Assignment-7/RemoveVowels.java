package Strings;
import java.util.Scanner;

public class RemoveVowels {
	
	private  String str;
	
	public RemoveVowels() {
		// TODO Auto-generated constructor stub
		
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
	}
	
	public boolean checkVowel(int i) {
		
		char c = str.toLowerCase().charAt(i);
		
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
			return true;
		
		return false;
	}
	
	public String printWithoutVowels() {
		
		String rev = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			if(checkVowel(i) == false) {
				
				rev += (str.charAt(i));
			}
		}
		
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveVowels s = new RemoveVowels();
		System.out.println(s.printWithoutVowels());
		
	}

}
