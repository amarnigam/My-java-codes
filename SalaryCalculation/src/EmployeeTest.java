import employee.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee peter=new Employee("E001","Peter",50000,"vasant vihar","peter123@gmail.com",9256584858L,"Jhon Smith","Quality Assurance",(byte)10);
peter.salaryCalculation();
peter.printAll();

	}

}
