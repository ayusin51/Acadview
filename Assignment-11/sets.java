import java.util.HashSet;
import java.util.Scanner;

public class sets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> s2 = new HashSet<>();
		System.out.println("Enter the Elements in set 1  and -1 to stop : ");
		Integer num = sc.nextInt();
		while(num != -1) {
			s1.add(num);
			num = sc.nextInt();
		}
		System.out.println("Enter the Elements in set 2  and -1 to stop : ");
		num = sc.nextInt();
		while(num != -1) {
			s2.add(num);
			num = sc.nextInt();
		}
		System.out.println("Elements in set 1 : "+s1);
		System.out.println("Elements of set 2 : "+s2);
		s2.retainAll(s1);
		System.out.println("Intersection of set1 and set2 : "+s2);
		sc.close();
	}

}
