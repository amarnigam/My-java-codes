import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
	     Scanner scanner=new Scanner(System.in);
	     System.out.println("Enter The String");
	     String input=scanner.next();
	     char array[]=input.toCharArray();
	     Arrays.sort(array);
	     System.out.println(array);
       int i=0;
         int Occurance=0;
         int maxOccurance=0;
         char c='#';
         //int length=newstr.length();
         //System.out.println(length);
         String newstr=new String(array);
         StringBuffer sb=new StringBuffer(newstr);
         //System.out.println(sb);
       // System.out.println(newstr.length());
         while(i<newstr.length()){
        	
        	String temp=String.valueOf(sb.charAt(i));
        	
        	//System.out.println(temp);
        	int  firstIndex=sb.indexOf(temp);
        	int  lastIndex=sb.lastIndexOf(temp);
        	 Occurance=lastIndex-firstIndex+1;
        	// System.out.println("No of Occurance of---"+temp+"  "+Occurance);
        	 
        	 /*if(Occurance>maxOccurance){
        		 maxOccurance=Occurance;
        		 c=temp;
        	 }
        	 i=lastIndex+1;*/
        	 
        	if(Occurance>1){
        		sb.delete(firstIndex, lastIndex);
        		System.out.println(sb);
        		int firstIndex1=sb.indexOf(temp);
        		i=firstIndex1+1;
        		if(i>sb.length()-1){
            		break;
            	}
        		continue;
        		
        	}
        	i=firstIndex+1;
        	if(i>sb.length()-1){
        		break;
        	}
        	 
         }
         System.out.println("String is="+sb);
        // System.out.println("Highest occurance of --"+c+"    "+maxOccurance);
	}

	}
