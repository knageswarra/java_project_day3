package abstract1;

public abstract class EmployeeService extends Employee{

	
	
	public abstract Employee createEmployee();
	public abstract void dispEmployees();
	public abstract void updateEmployeeById(String empid);
	public abstract void deleteEmployeeById(String empid);

}
