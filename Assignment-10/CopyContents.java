package FileOperations;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class CopyContents {
	
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("C:\\Users\\Lenovo\\Desktop\\Acadview\\Assignment-10\\abc.txt");
		File f2 = new File("C:\\Users\\Lenovo\\Desktop\\Acadview\\Assignment-10\\xyz.txt");
		FileReader fr = null;
		
		try {
			
			fr = new FileReader(f1);
			String str = "";
			int c;
			while(( c = fr.read()) != -1) {
				
				str += (char)c;
			}
			
			fr.close();
			
			FileWriter fw = new FileWriter(f2);
			fw.write(str);
			fw.close();
			
			System.out.println("Contents : ");
			
			fr = new FileReader(f2);
			while(( c = fr.read()) != -1) {
				
				System.out.print((char)c);
			}
			fr.close();
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
	}

}
