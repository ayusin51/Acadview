import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 2; i < 10; i++) {
			
			arr.add(i*2);
		}
		Collections.sort(arr);
		System.out.println(arr);
		
		
	}

}
