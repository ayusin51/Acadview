public class OverloadPrint {
	
	void print () {
		
		System.out.println("Null Arguments");
	}
	
	void print (int a) {
			
			System.out.println("Int : " + a);
		}
	
	void print (float c) {
		
		System.out.println("Float : " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadPrint obj = new OverloadPrint();
		obj.print();
		obj.print(1);
		obj.print(1.3f);

	}

}
