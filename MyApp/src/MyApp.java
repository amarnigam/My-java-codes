import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
	
		Scanner scanner=new Scanner(System.in);//scanner creates buffer to take input
		System.out.println("enter two input");//system.in is used to take input
		a=scanner.nextInt();//next int fetches the values from the buffer
		b=scanner.nextInt();
		int c=a+b;
		System.out.println("परिणाम  यह है ="+c);
		scanner.close();//to avoid memory leak scanner is closed
		//otherwise application may crash
	}

}
