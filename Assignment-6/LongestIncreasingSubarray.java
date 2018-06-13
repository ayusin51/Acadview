import java.util.Scanner;

public class LongestIncreasingSubarray {
	
	public static int subarray(int [] arr) {
		
		int size = arr.length;
		int len = 1, count = 1;
		
		for(int i = 0; i < size-1; i++) {
			while( (i < size-1) && (arr[i] < arr[i+1]) ) {
				count++;
				i++;
			}
			if(count > len) len = count;
			count = 0;
		}
		
		return len;
	}

	public static void main(String[] args) {

		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int [] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int length = subarray(arr);
		
		System.out.println("Length of Longest increasing subarray is " + length);
	}

}
