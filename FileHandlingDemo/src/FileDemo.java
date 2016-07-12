import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File dir=new File("G:\\my java codes ducat/dir");
		dir.mkdir();
		File file=new File("G:\\my java codes ducat/dir/amar.txt");
		if(file.exists()){
			System.out.println("  Yes File Exist");
			
			
		}
		else{
			System.out.println("No File Does not Exist");
			file.createNewFile();
		}

	}

}
