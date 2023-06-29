package abstract1;

import java.util.Scanner;
import java.util.UUID;
import java.util.Vector;

public class EmployeeSerImp extends EmployeeService{
	private Scanner sc=new Scanner(System.in);

	Vector<Employee> em=new Vector<Employee>();
	

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter the first name");
		String fn=sc.next();
		System.out.println("Enter the last name");
		String ln=sc.next();
		System.out.println("Enter the email");
		String em=sc.next();
		System.out.println("Enter the salary");
		int salary=sc.nextInt();
		System.out.println("Enter the id");
		String id=sc.next();
		Employee x=new Employee();
		x.setEmail(em);
		x.setFname(fn);
		x.setId(id);
		x.setLname(ln);
		x.setSalary(salary);
		this.em.add(x);
		return x;
		
	}

	@Override
	public void dispEmployees() {
		// TODO Auto-generated method stub
		for(Employee e:em)
		{
			System.out.println(e.getDetails());
		}
		
	}

	@Override
	public void updateEmployeeById(String empid) {
		// TODO Auto-generated method stub
		for(Employee e:em)
		{
			if(e.getId().equals(empid))
			{
				System.out.println("Enter the first name");
				String fn=sc.next();
				System.out.println("Enter the last name");
				String ln=sc.next();
				System.out.println("Enter the email");
				String em=sc.next();
				System.out.println("Enter the salary");
				int salary=sc.nextInt();
				e.setEmail(em);
				e.setFname(fn);
				
				e.setLname(ln);
				e.setSalary(salary);
			}
		}
		
	}

	@Override
	public void deleteEmployeeById(String empid) {
		// TODO Auto-generated method stub
		int index=0;
		for(Employee e:em)
		{
			if(e.getId().equals(empid))
			{
				break;
			}
			index++;
		}
		if(index>=0 && index<em.size())
		        em.removeElementAt(index);
		
	}

	
	
}
