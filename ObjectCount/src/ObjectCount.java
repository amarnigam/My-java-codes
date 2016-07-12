class A{
	static int counter;
	//int counter;
	String name;
	A(String name){
	this.name=name;
	counter++;
	System.out.println("name is "+name+" object no."+counter);
	}
}
public class ObjectCount {

	public static void main(String[] args) {
		A ram=new A("ram");
		A shyam=new A("shyam");

	}

}
