package enumeration;

public class Employee {

	private int age;
	private String name;
	private DEPT dept;
	
	
	public Employee(int age, String name, DEPT dept) {
		super();
		this.age = age;
		this.name = name;
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public DEPT getDept() {
		return dept;
	}
	
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", dept=" + dept + "]";
	}
	public static void main(String args[])
	{
		Employee e= new Employee(5,"nagu",DEPT.it);
		System.out.println(e);
		
	}
	
	
}
