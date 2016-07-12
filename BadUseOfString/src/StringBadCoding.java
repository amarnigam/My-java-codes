import java.util.Scanner;

public class StringBadCoding {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String sql="select* from Product where type=";// a memory is created in pool for sql
		System.out.println("enter what you want to search");
		String itemname=scanner.next();// a new memory is created for item name
		sql=sql+" ' "+itemname+" ' ";// now here both single quotes have memory in pool
		//now a new memory is created for sql
		// so pool becomes full
		// here old memory is not deleted
		System.out.println(sql);

	}

}
