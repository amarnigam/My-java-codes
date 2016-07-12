interface P{
	void show();
	void print();
}
// adapter is a design pattern
// adapter provides developer an option that he may override the method or not
 abstract class PAdapter implements P{
	public void show(){
		System.out.println("SHOW OF PADAPTER");
	}
	public void print(){}
}
 class P1 implements P{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}}
 // whenever we extends any abstract class which implements an interface then we must overide 
 // the all other method which are defined in Adapter class
 // Now the limitation here is that P2 can not extends any other class
	 class P2 extends PAdapter{

	
		}
		 
	 
 
public class InterfaceDemo {

	public static void main(String[] args) {
		P2 obj=new P2();
		obj.show();

	}

}
