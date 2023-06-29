package abstract1;

import java.util.Scanner;

public class Services {

	static Scanner sc= new Scanner(System.in);
	
	public static void main(String args[])
	{
		EmployeeSerImp e=new EmployeeSerImp();
		while(true)
		{
			System.out.println("1.Create a Employee");
			System.out.println("2.Display all employees");
			System.out.println("3.update a employee by id");
			System.out.println("4.delete a employee by id");
			System.out.println("0.exit");
			System.out.println("enter ur choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				e.createEmployee();
				break;
			case 2:
				e.dispEmployees();
				break;
			case 3:
				System.out.println("enter the empid whose details u want to update");
				String empid=sc.next();
				e.updateEmployeeById(empid);
				break;
			case 4:
				System.out.println("enter the empid whom u want to delete");
				String empid1=sc.next();
				e.deleteEmployeeById(empid1);
				break;
			case 5:
				System.out.println("Bye...");
				System.exit(1);
				break;
			default:
				System.out.println("Invalid choice");
				break;
				
				
			}
		}
	}
	
}
