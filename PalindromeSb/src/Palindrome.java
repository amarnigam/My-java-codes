import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		//StringBuffer sbd=sb;
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
		String s1=rev.toString();
		System.out.println(s1);
		//String s2=sb.toString();
		//System.out.println(sbd);
		//System.out.println(sb);
		//System.out.println(rev);
		//System.out.println(s1+s2);
		
		/*StringBuffer rev=sb.reverse();
		System.out.println(rev);
		System.out.println(sb);*/
		int x=s1.compareToIgnoreCase(s);
		System.out.println(x);
		if(x==0){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");}
		

	}

}
