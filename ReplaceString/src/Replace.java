import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string");
		String str=scanner.nextLine();
	System.out.println("enter what you want to replace");
	String old=scanner.next();
	System.out.println("enter what u want to insert");
	String nev=scanner.next();
	char o[]=old.toCharArray();
	char n[]=nev.toCharArray();
	for(int i=0;i<old.length();i++){
		str.replace(o[i], n[i]);
	}
	System.out.println(str);
	}

}
