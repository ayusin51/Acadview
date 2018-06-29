package Strings;
import java.util.Scanner;

public class GenerateSubstrings {
	
	String str;
	public GenerateSubstrings() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		sc.close();
	}
	
	void printSubstrings() {
		
		for(int i = 0; i < str.length(); i++) {
			
			for(int j = i+1; j < str.length()+1; j++) {
				
				System.out.println(str.substring(i, j));
			}	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenerateSubstrings s = new GenerateSubstrings();
		s.printSubstrings();

	}

}
