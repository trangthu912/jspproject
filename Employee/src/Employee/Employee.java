package Employee;

public class Employee {
	protected String name;
	protected int id;
	protected double salary;
	protected double age;
	protected boolean married;
	protected Job job ;
	public Employee (String name, int id, double salary, double age, boolean married, Job job) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.married= married;
		this.job = job ;

}
