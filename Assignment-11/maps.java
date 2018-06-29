import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maps {
	
	public static void main(String[] main) {
		Scanner rollSc = new Scanner(System.in);
		Scanner nameSc = new Scanner(System.in);
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		Integer rollNo;
		String name = "";
		
		//To stop enter roll no as -1
		
		System.out.print("Roll no : ");
		while((rollNo = rollSc.nextInt()) != -1) {
			System.out.print("Name : ");
			name = nameSc.nextLine();
			map.put(rollNo,name);
			System.out.print("Roll no : ");
		}
		
		for(Map.Entry maps:map.entrySet()) {
			System.out.println("Key : "+maps.getKey()+"    Value : "+maps.getValue());
		}
		rollSc.close();
		nameSc.close();
		
	}

}
