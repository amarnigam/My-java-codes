
public class TypePromotion {
	/*public int add(int...x){
		int sum=0;
		for(int y:x){
			sum=sum+y;
			
		}
		return sum;
	}*/
	void print( byte x){
		System.out.println("byte");
		
	}
	void print(short x){
		System.out.println("short");
	}
	void print(long x){
		System.out.println("long");
	}
	void print(int x){
		System.out.println("int");
	}
	/*
	void print(Integer x){
		System.out.println("Integer");
	}*/
	void print(Long x){
		System.out.println("Long");
	}
	/*
	void print(int...x){
		System.out.println("int...");
	}/*
	void print(float x){
		System.out.println("float");
	}*/
	/*
	void print(double x){
		System.out.println("double");
	}*/


	public static void main(String[] args) {
	TypePromotion obj= new TypePromotion();
	obj.print(100);
	/*System.out.println("sum is"+obj.add());
	System.out.println("su is"+obj.add(5));
	System.out.println("sum is"+obj.add(10,20,30,40));*/
	
	
	

	}

}
