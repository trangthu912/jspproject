package Lab5;

import vd1.Job;

public class Employee {
	protected String name;
	protected int id;
	protected double salary;
	protected int age;
	protected boolean married;
	protected Job job ;
	public Employee (int id, String name, int age, double salary, boolean married, Job job) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.married= married;
		this.job = job ; 
}
