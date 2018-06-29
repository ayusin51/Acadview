public class Sort {

	public static void print(int [] arr) {
	
		for(int a : arr) {
			
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
	
		int arr[]=new int[]{1,1,1,1,0,0,1,0};
		int len = arr.length;
		int temp, j = 0;
		
		for(int i = 0; i < len; i++) {
			
			if(arr[i] == 0) {
			
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			
		}
		
		print(arr);
		
	}
}
