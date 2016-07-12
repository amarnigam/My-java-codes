import java.util.Scanner;
public class UserInput {
	
	public static void main(String[] args) {
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
	for(int i1=0;i1<10;i1++){
			a[i1]=sc.nextInt();
		}
		for(int x:a){
			System.out.println("array is"+x );
		}
		sc.close();
	}

}

