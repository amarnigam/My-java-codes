import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scanner.next();
		StringBuffer sb=new StringBuffer(str);
		int length=str.length();
		System.out.println(length);
		int i=0;
		while(i!=length){
			
			char c=sb.charAt(0);
			//System.out.println(c);
			sb.deleteCharAt(0);
			//System.out.println(sb);
			sb.insert(length-1, c);
			//System.out.println(sb);
			//String newString=sb.toString();
			System.out.println(sb);
			i++;
		}

	}

}
