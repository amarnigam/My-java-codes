package employee;
public class Employee {
	private String employeeNo;
	private String name;
	private int salary;
	private String address;
	private String email;
	private long phoneNo;
	private String managerName;
	private String departmentNo;
	private byte experience;
	private final int providentfund;
	public Employee(String employeeNo,String name,int salary, String address, String email,long phoneNo,
String managerName,String departmentNo,byte experience){
		this.employeeNo=employeeNo;
		this.name=name;
		this.salary=salary;
		this.address=address;
		this.email=email;
		this.phoneNo=phoneNo;
		this.managerName=managerName;
		this.departmentNo=departmentNo;
		this.experience=experience;
		providentfund=10000;
	}
	public int houseAllowance(){
		int houseAllowance=(int) (0.3*salary);
		return houseAllowance;
	}
	public int districtAllowance(){
		int districtAllowance=(int) (0.2*salary);
		return districtAllowance;
	}
	public int  transportAllowance(){
		int  transportAllowance=(int) (0.1*salary);
		return  transportAllowance;
	}
	public int salaryCalculation(){
salary=houseAllowance()+transportAllowance()+districtAllowance()+salary-providentfund;
return salary;
}
	public void printAll(){
		System.out.println("Name is:"+name);
		System.out.println("EmployeeNo is:"+employeeNo);
		System.out.println("salary is:"+salary);
		System.out.println("Address is:"+address);
		System.out.println("Email is:"+email);
		System.out.println("phone no is:"+phoneNo);
		System.out.println("Manager Name is:"+managerName);
		System.out.println("Department Name is"+departmentNo);
		System.out.println("Experience is:"+experience+"years");
		
		
	} 
}
