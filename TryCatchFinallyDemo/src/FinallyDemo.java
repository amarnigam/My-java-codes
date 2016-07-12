import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

class UseFinally {
	static final int  EOF=-1;
	
	static void readFile() throws FileNotFoundException,IOException{
		String path="";
		FileInputStream fi=null;
		try {
			
			fi=new FileInputStream(path);//file open
			int singleByte=fi.read();
			while(singleByte!=EOF){
				System.out.print((char)(singleByte));
				singleByte=fi.read();
				}
			//if(10>2){
			//	System.exit(0);
				//return;
			//}
			
		}
		
		

		finally{
			System.out.println("finally runs......");
			
			if(fi!=null){
				try{
				fi.close();
				}
				catch(IOException e){
					e.printStackTrace();
				}// if file not closed it will give error file is already in use
			}
		}
}
	}
public class FinallyDemo {

	public static void main(String[] args) {
		try{
			UseFinally.readFile();}
			/*catch (FileNotFoundException e) {
				System.out.println("File Not Found");
			
		} 
			catch(IOException e){
				System.out.println("Can't read the file");
			}*/
			catch(Exception e){
				System.err.println("contact to administrator");
				e.printStackTrace();
			}
	}

}
