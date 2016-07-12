import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no");
		int x=0;
		int y=0;
		int result=0;
		try{
		 x=sc.nextInt();
		 }
		catch(InputMismatchException e){
				System.out.println("enter a number");
				System.out.println("Enter the first no again");
			sc.nextLine();
				 x=sc.nextInt();
		}
System.out.println("enter the second no");
try{
 y=sc.nextInt();}
catch(InputMismatchException e){
	System.out.println("enter a number");
	System.out.println("enter the second no again");
	sc.nextLine();
	y=sc.nextInt();
}
try{result=x/y;}
catch(ArithmeticException e){
	System.out.println("can not be divisble through 0");
}
System.out.println("result is"+result);
	}

}
