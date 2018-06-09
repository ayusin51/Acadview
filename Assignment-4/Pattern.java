import java.util.Scanner;

public class Pattern {

	public static void print(int size) {
		
		for(int i = size; i > 0; i--)
		{
			for(int j = i; j > 0; j--)
			{
				System.out.print("*");
			}
		
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
	
		print(size);
	}
}
