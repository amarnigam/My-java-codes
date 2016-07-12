
public class StringDemo {

	public static void main(String[] args) {
		String a="Hello";
		String b="Hello";// both a and b are pointing to same location in pool becoz they are having same value
		String c=new String("Hello");
		//if(a==b)
				if(a==c){
			System.out.println("same reference");
		}
		else {
			System.out.println("not same reference");
		}
		//if(a.equals(b))
				if(a.equals(c)){
			System.out.println("same value");
		}
		else{
			System.out.println("not same value");
		}

	}

}
