import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project {
	
	public static void populateArray(String path,ArrayList<File> array) {
		File f = new File(path);
		File [] files = f.listFiles();
		for(File file : files) {
			System.out.println("Name : "+file.getName()+" \nPath : "+file.getAbsolutePath());
			if(file.isFile()) {
				array.add(file);
			} else if(file.isDirectory()) {
				populateArray(file.getAbsolutePath(),array);
			}
		}
	}
		

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first path : ");
		String p1 = scan.nextLine();
		scan.close();
		String p2 = "output.csv";
		
		ArrayList<File> array = new ArrayList<>();
		
		try {
			File file1 = new File("abc.txt");
			file1.createNewFile();
			FileWriter fileWriter1 = new FileWriter(file1);
			fileWriter1.write(p1+10+p2);
			fileWriter1.close();
			
			populateArray(p1,array);
			
			File file2 = new File(p2);
			file2.createNewFile();
			
			FileWriter fileWriter2 = new FileWriter(file2);
			
			for(int i=0;i<array.size();i++) {
				fileWriter2.write(array.get(i).getName()+","+array.get(i).getAbsolutePath()+"\n");
			}
			fileWriter2.close();
		}
		
		catch (Exception e) {
			System.out.print("Error in path");
		}
	}

}
