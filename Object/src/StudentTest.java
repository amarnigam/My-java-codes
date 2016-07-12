import student.*;
public class StudentTest {

	public static void main(String[] args) {
Student ram=new Student();
System.out.println("ROLLNO IS:"+ram.hashCode());
System.out.println("roll no:"+ram);
System.out.println("name is:"+ram.name);
System.out.println("address is:"+ram .address);
System.out.println("age is:"+ram.age);
System.out.println("_________________________________________________________");
Student shyam=new Student();
System.out.println("ROLLNO IS:"+shyam.rollno);
System.out.println("name is:"+shyam.name);
System.out.println("address is:"+shyam .address);
System.out.println("age is:"+shyam.age);



	}

}
