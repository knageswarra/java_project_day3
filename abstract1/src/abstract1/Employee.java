package abstract1;

public class Employee {
	
	private String id;
	private String fname;
	private String lname;
	private String email;
	private int salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getEmail() {
		return email;
	}
	public int getSalary() {
		return salary;
	}
	public String getDetails()
	{
		return "id is "+id+" ,first name is "+fname+
				" last name is"+lname+" email is "+email+"salary is "+salary;
	}

}
