import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo=new FileOutputStream("G:\\my java codes ducat/dir/amar.txt");
		String data="Hello amar you had created me";
		fo.write(data.getBytes());
		fo.close();
		System.out.println("Data written.......");
	}

}
