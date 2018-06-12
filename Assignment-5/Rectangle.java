public class Rectangle{
    
    
	int length, breadth;
    

    
	Rectangle(int l, int b) {
        
        
		length = l;
        breadth = b;
    
	}


    
    void showArea() {

        
        System.out.println("Area of rectangle is " + this.length * this.breadth);

    	}


    
    
public static void main(String []args) {


        	Rectangle rect = new Rectangle(10, 20);

        	rect.showArea();

     	}

}