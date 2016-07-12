import java.util.Arrays;
import java.util.Scanner;

public class LetterCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
String str=sc.nextLine();
StringBuffer sb=new StringBuffer(str);
sb.delete(0, 2);
System.out.println(sb);
char w[]=str.toCharArray();
Arrays.sort(w);
String str1=String.valueOf(w);
StringBuffer sb1=new StringBuffer(str1);
System.out.println(w);
int length =str1.length();
System.out.println(length);
int n=0;
int i=0;
int x;
int index;
int x1;
int maxOccurance=0;
int Occurance=0;
char c='#';
//System.out.println(sb1);
while(i<sb1.length()){
	System.out.println(sb1.length());
String temp=String.valueOf(sb1.charAt(n));
	 x=sb1.lastIndexOf(temp);
	System.out.println(x);
	index=x+1;// index is next index of next letter
	x1=x-n+1;// x1 is no of letter 
	Occurance=x1;
			String t=sb1.toString();
			char t1[]=t.toCharArray();
	System.out.println("no of "+t1[n]+"="+x1);
	if(Occurance>1){
		sb1.delete(n, index-1);
		System.out.println(sb1);
		n=0;
		i=index;
		continue;
	}
	/*if(Occurance>maxOccurance){
		maxOccurance=Occurance;
		c=w[n];
		
		
		//System.out.println(c);
	}*/
	n=index;
	if(n>length-1){
		break;
	}
	i=index;
	
}
System.out.println(sb1);
//System.out.println("Highest Occurence is of "+c+"-----"+maxOccurance);

	}

}
