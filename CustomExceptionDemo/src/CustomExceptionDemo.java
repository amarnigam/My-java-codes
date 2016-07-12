import java.util.Scanner;
class Employee{
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
class MinorAgeException extends Exception{
	@Override
	public String toString(){
		return "Sorry you are not eligible to vote";
	}
	
}
public class CustomExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE AGE");
		int Age=sc.nextInt();
		try{
			if(Age<18){
		throw new MinorAgeException();
		//System.out.println("Sorry You Are not eligible");
		
			}
		System.out.println("congrats! You can vote");
		
			}
				catch(MinorAgeException e){
			//System.out.println("Sorry you are minor you can not vote");
			System.out.println(e);
		}
		Employee ram=new Employee(1001,"Ram");
		System.out.println(ram);
		System.out.println(ram.toString());
		//String amit=new String("amit");// here the string overides the toSrtring() method of object class
		//System.out.println(amit);
	
	

}
}