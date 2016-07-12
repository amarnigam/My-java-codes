class PP{
	int x=200;
	PP(){
		System.out.println("PP default");
		
	}
	PP(int x){
		this();
		//this is present here by default 
		//calls the default constructor
		System.out.println("pp parametrized");
	}
}
class QQ extends PP{
	int x;
	QQ(){
		super(100);
		x=100;
		//int sum=x+x;//by default this.x is present here in place of x
		int sum=super.x+super.x;
		//super(10);
		//super is present here by default
		System.out.println("qq default and sum is:"+sum);
	}
		QQ(int x){
			this();//by default here super is present
			//to call default constructor this is used here
			System.out.println("qq parametrized");
		}
} 
public class SuperDemo {

	public static void main(String[] args) {
		//SuperDemo s=new SuperDemo();
		QQ obj=new QQ(10);

	}

}
