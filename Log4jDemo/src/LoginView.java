import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.oracle.Log4jDemo.LoginDAO;
public class LoginView {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 Logger logger=Logger.getLogger(LoginView.class);
	        logger.debug("Inside main");
	        
		System.out.println("Enter the user id");
		String userid=scanner.next();
		System.out.println("Enter the password");
        String password=scanner.next();
        LoginDAO obj=new LoginDAO();
       logger.debug("Check Login method");
        String result=obj.checkLogin(userid,password);
        System.out.println(result);
       try{
    	   int a=20/0;
    	   System.out.println(a);
       }
       catch(ArithmeticException e){
    	   StringWriter sw=new StringWriter();
    	   PrintWriter pw=new PrintWriter(sw);
    	   e.printStackTrace(pw);
    	   logger.error(sw);
       }
        scanner.close();
	}

}
