package Strings;
import java.util.Scanner;

public class CountWords {
	
	String str;
	
	public CountWords() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
	}
	
	public int count() {
		
		if(str.length() == 0) return 0;
		int count = 0;
		int pos;
		
		do {
			count++;
			pos = str.indexOf(' ');
			str = str.replaceFirst(" ", "0");
		}while(pos != -1 && pos != str.length()-1);
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountWords s = new CountWords();
		System.out.println(s.count());
	}

}
