
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer(100);
		sb.append("hello");
		// by default it has capacity of 16
		
		System.out.println("capcity is"+sb.capacity());
		System.out.println("length is "+sb.length());
		// now when we append something to string then at 
		// now newcapacity=capacity*2+2;
		sb.append("how are you is everything fine at home");
		System.out.println("new capacity is"+sb.capacity());
		System.out.println("length is "+sb.length());
		// now when again if something is append to string 
		// then a capacity is equal to length if length is greater than new capacity
		sb.append(" yes i am fine what about r u okay lets meet somewhere what u say" );
		System.out.println("new capacity is "+sb.capacity());
		System.out.println("length is "+sb.length());
	}

}
