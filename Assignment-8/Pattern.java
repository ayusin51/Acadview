package Strings;
import java.util.Scanner;

public class Pattern {
	
	int len;
	
	public Pattern() {
		// TODO Auto-generated constructor stub
		
		Scanner sc = new Scanner(System.in);
		len = sc.nextInt();
	}
	
	void print() {
		
		/*char ch = 'a';
		
		for(int i = 0; i < len; i++) {
			ch = 'a';
			for(int j = -(len-1); j < len; j++) {
				
				if(i >= Math.abs(j)) {
					System.out.print(ch);
					ch++;
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}*/
		
		for(int i = 0; i < len; i++) {
			
			char ch = 'a';
			for(int j = 0; j <= i; j++) {
				
				System.out.print(ch++);
			}
			System.out.println(5);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p = new Pattern();
		p.print();

	}

}
