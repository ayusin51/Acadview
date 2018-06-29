public class Complex{

    
    int real, imag;

    
    Complex(int r, int i) {
 
       
         real = r;

        	imag = i;

   	 }


    
    void showNum() {

        
        System.out.print("Complex number is " + real);

        	if (imag >= 0) System.out.print(" + ");

        	System.out.print(imag + "i");

	}


    
    
 public static void main(String []args){
	
        Complex num = new Complex(10, 20);
	
        num.showNum();
	
 }

}