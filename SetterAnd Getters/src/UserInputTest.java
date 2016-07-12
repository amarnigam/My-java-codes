import userinput.*;;
public class UserInputTest {

	public static void main(String[] args) {
	UserInput amar=new UserInput();
	amar.setName("amar");
	amar.setRollNo(130271);
	amar.setEmail("amarnigam324@gmail.com");
	amar.setAddress("abcxyz");
	System.out.println("Name is:"+amar.getName());
	System.out.println("address is:"+amar.getAddress());
	System.out.println("email is:"+amar.getEmail());
	System.out.println("roll no is"+amar.getRollNo());

	}

}
