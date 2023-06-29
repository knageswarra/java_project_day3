package interfaces;



public interface EmployeeSer {

	public abstract Employee createEmployee();
	public abstract void dispEmployees();
	public abstract void updateEmployeeById(String empid);
	public abstract void deleteEmployeeById(String empid);
}
