interface calc{
	int add(int x,int y);
//int sub(int x,int y);
	}
/*interface X {
	int a=10;
	
}
interface Y{
	int a=20;
	
}
class T implements X,Y{
	int x=X.a;
	int y=Y.a;
	//int c=super.X.a;
	
	
} */
/*class Mycalc implements calc{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	
}*/
public class InterfaceWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Mycalc obj=new Mycalc();
//int x=obj.add(10, 20);
//System.out.println("sum is"+x);
	// 2.ANONYMOUS CLASS
		// here a anonymous class is created like class    implements calc
		//we need to override each functions
		calc obj=new calc(){

			@Override
			public int add(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}

			//@Override
			//public int sub(int x, int y) {
				// TODO Auto-generated method stub
		//		return 0;
			//}
			
		};
		int x=obj.add(10,20);
		System.out.println("sum is"+x);
		//3.LAMBDA EXPRESSION
		calc c=(a,b)->{
			int d=10;
			return a+b+d;
		};
		System.out.println("sum is"+c.add(20, 30));
	}
	
}

