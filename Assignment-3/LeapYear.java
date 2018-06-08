import java.util.Scanner;

public class LeapYear {

	public static boolean checkLeapYear(int year)
	{
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				{
					return true;
				}
			} else 
			{
				return true;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean ans = checkLeapYear(year);
		
		System.out.println("The Year " + year + " is a leap year : " + ans);
	}
}
