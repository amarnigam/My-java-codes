class A{
	static int x;
	static void show(){
		System.out.println("static show of A class");
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		//A obj=new A();
		A.x=10;
		System.out.println("X IS "+A.x);
		A.x=20;
		System.out.println("x is "+A.x);
		A.show();

	}

}
