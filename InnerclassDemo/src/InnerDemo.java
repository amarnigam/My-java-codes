class A{
int e=100;	
class B{
	int e=200;
	int sum=e+e;
	//int sum=A.this.e+A.this.e;
	void show(){
	System.out.println("sum is"+sum);}
	}
}
class Emp{
	Emp(){
		System.out.println("emp constructor");
	}
	class Dept{
		Dept(){
			System.out.println("dept constructor");
		}
	}
}
public class InnerDemo {

	public static void main(String[] args) {
		// here d is an object of inner class dept
		// but to call dept contructor we need to first create an object of outer class
		//Emp.Dept d=new Emp().new Dept();
		Emp e=new Emp();
		Emp.Dept d=e.new Dept();
		A.B obj=new A().new B();
		obj.show();

	}

}
