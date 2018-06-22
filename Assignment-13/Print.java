public class Print {
	
	public static <t> void printArray(t [] arr) {
		
		int len = arr.length;
		for(int i = 0; i< len; i ++) {
			
			System.out.println(arr[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arr = new Integer[] {1, 5, 4, 9};
		printArray(arr);
		//System.out.println("end");

	}

}
