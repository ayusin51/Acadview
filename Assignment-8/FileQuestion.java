package FileOperations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;


public class FileQuestion {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Acadview\\src\\FileOperations\\demo.txt");
		file.createNewFile();
		
		FileReader in = null;
		
	    try {
	    	
	    	in = new FileReader(file);
	    	System.out.println("File is Opened");
	    	int c;

	    	while((c = in.read()) != -1) {
			   System.out.print((char)c);
		   }
	    	
	    	System.out.println();
	    } 
	    
	    catch(InputMismatchException e) {
	    	
	    	System.out.println("Invalid Input");
	    } 
	    
	    finally {
	 	  
	    	if (in != null){
	    		
	 		    in.close();
	 		    System.out.println("File is Closed");
	 	   }
	    }
	 }
}