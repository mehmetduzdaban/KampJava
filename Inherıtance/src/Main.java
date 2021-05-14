
public class Main {

	public static void main(String[] args) {
		
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		customer.age=27;
		customer.email="ornek@gmail.com";
		customer.firstname="Mehmet";
		customer.lastname="DÜZDABAN";
		customer.id= 1;
		
		employee.age=28;
		employee.firstname= "burak";
		employee.lastname="Aga";
		employee.salary= 15.000;
		employee.id=2;
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		employeeManager.BestEmployee();
		
		employeeManager.Add();
		employeeManager.List();
		customerManager.Add();
		customerManager.List();
		
		
		
	}

}
