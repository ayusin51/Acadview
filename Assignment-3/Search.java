import java.util.Scanner;

public class Search {

	public static int BinarySearch(int [] arr, int wanted, int start, int end) {
		if (start <= end) {
			int mid = (start + end)/2;
			if(arr[mid] == wanted) {
			
				return mid;
				
			} else
			if(arr[mid] < wanted) {
				
				return BinarySearch(arr, wanted, mid+1, end);
				
			} else {
				
				return BinarySearch(arr, wanted, start, mid-1);
				
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
	
		int arr[] = new int[]{1, 4, 5, 6, 7, 8, 9};
		
		Scanner sc = new Scanner(System.in);
		int wanted = sc.nextInt();
		int pos = BinarySearch(arr, wanted, 0, arr.length-1);
		
		if(pos != -1) {
		
			System.out.println("Found at position " + pos);
		}else {
			
			System.out.println("Not Found");
		}
	}
}
