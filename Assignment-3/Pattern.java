import java.util.Scanner;

public class Pattern {

	public static void Print(int size) {
		
		int i, j;
		for(i = 0; i < size; i++)
		{
			for(j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		Print(size);
	}
}
