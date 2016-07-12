import java.util.ArrayList;

class Employee{
	private int empId;
	private String name;
	private double salary;
	Employee(int empId,String name,double salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
}
public class EmployeeTest {
	public static void main(String[] args) throws Exception {
		int empId=0;
		System.out.println("program starts");
		ArrayList list=new ArrayList();// array list is used here to store the refernce of each object while it is created inside the while loo
		
		while(true){
			//System.out.println("program starts");
			Employee emp=new Employee(1,"ram",9000);
			list.add(emp);//the gc will deallocate the old reference  
			//Thread.sleep(50);//ram wil get new refernce each time
		}

	}

}
