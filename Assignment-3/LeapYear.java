import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean ans = false;
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				{
					ans = true;
				}
			} else 
			{
				ans = true;
			}
			
		}
		
		System.out.println("The Year " + year + " is a leap year : " + ans);
	}
}
