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
		
		File f1 = new File("File-1.txt");
		File f2 = new File("C:\\Users\\Lenovo\\Desktop\\Acadview\\Assignment-10\\File-2.txt");
		FileReader fr = null;
		
		try {
			
			fr = new FileReader(f1);
			String str = "";
			int c;
			while(( c = fr.read()) != -1) {
				
				str += (char)c;
				System.out.print((char)c);
			}
			
			FileWriter fw = new FileWriter(f2);
			fw.write(str);
			fw.close();
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} finally {
			if (fr != null)
				fr.close();
		}
	}

}
