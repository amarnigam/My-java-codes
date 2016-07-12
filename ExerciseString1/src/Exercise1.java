import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fullstr="";
String input;
System.out.println("enter the string");
input=sc.nextLine();
String array[]=input.split(" ");
for(int i=0;i<array.length;i++){
	int n=array[i].length();
	array[i]=array[i].toLowerCase();
	String t=String.valueOf(array[i].substring(0,1));
	t=t.toUpperCase();
	array[i]=t+(array[i].substring(1,n));
	
//array[i]=String.valueOf(array[i].(charAt(0)).toUpperCase());
	//char c=array[i].charAt(0);
	//String s=String.valueOf(c);
	//String s1=s.toUpperCase();
fullstr=fullstr+array[i]+" ";
}
System.out.println(fullstr);
	}


}
