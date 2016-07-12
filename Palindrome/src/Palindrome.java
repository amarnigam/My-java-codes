import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String input=sc.nextLine();
		int x=input.length();
		System.out.println(x);
		char a[]=input.toCharArray();
		System.out.println(a);
		char b[]=new char[x];
		int j=x;
		for(int i=0;i<x;i++){
			b[i]=a[j-1];
			j--;
		}
		System.out.println(b);
		String str=String.valueOf(b);
		int n=str.compareToIgnoreCase(input);
		System.out.println(n);
		if(n==0){
			System.out.println("String is palindrome  ");
		}
		else{
			System.out.println("String is not palindrome");
		}

	}

}
