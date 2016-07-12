import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo2 {
	Scanner sc=new Scanner(System.in);
	int x=0;
	int result=0;
int input(){
	try{
	 x=sc.nextInt();
	 }
	catch(InputMismatchException e){
		System.out.println("Please enter a no");
		sc.nextLine();
		input();
	}
	return x;
}
int result(int a,int b){
	try{
		result=a/b;
	}
	catch(ArithmeticException e){
		System.out.println("can't divisible through zero");
		System.out.println("please enter the second no again");
		b=input();
		result(a,b);
	}
	return result;
}
	public static void main(String[] args) {
		ExceptionDemo2 obj=new ExceptionDemo2();
		System.out.println("Enter the first no");
         //obj.input();
         int a=obj.input();
         System.out.println("Enter the Second no");
        // obj.input();
         int b=obj.input();
         
         System.out.println("Result is::");
        
       int result= obj.result(a,b);;    
       System.out.println("Final result is"+result);
         
	}

}
