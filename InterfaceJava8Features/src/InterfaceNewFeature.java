interface K{
	void show();
	// here default is not a scope it is a keyword to  define any method in interface
	// this features was introduced in java 8
	// to provide flexibility in interface
	// because not all the time 100% design is implemented
	default void print(){
		System.out.println("print of k interface");
	}
	int x=10;
}
interface Q{
	int x=10;
	/*default void print(){
		System.out.println("print of interface Q"); 
	}*/
}
class K1 implements K,Q{
  
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show of k1 class");
		K.super.print();
	
	}
	int a=Q.x;

	
	/*public void print() {
		// TODO Auto-generated method stub
		K.super.print();
	}*/
}
public class InterfaceNewFeature {

	public static void main(String[] args) {
		K1 obj=new K1();
		obj.show();
		obj.print();

	}

}
