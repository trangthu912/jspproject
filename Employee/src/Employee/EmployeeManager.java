package Employee;

import java.util.Scanner;

public class EmployeeManager {
		
//		public static void main(String[]args) {
//			menu();
//			System.out.println("ket thuc");
//
//			
//		}
//	
//		public static void menu() {
//			do{
//				System.out.println("MENU");
//				System.out.println("1.Create employee");
//				System.out.println("2.Show the existing employee");
//				System.out.println("3.exit");
//				System.out.println("==============================");
//				Scanner input = new Scanner (System.in);
//				System.out.println("Nhap : ");
//				int n = input.nextInt();
//				int t = 0 ;
//				switch(n) {
//					case (1):
//						System.out.println("Create employee");
////						Employee[] a;
////						Job[] b;
////						System.out.println("id : ");
////						int id = input.nextInt();
////						System.out.println("name : ");
////						String name = input.nextLine();
////						System.out.println("age : ");
////						int age = input.nextInt();
////						System.out.println("salary : ");
////						Double salary = input.next;
////						System.out.println("married : ");
////						String married = input.nextLine();
////						System.out.println("jobName : ");
////						String jobName = input.nextLine();
////						System.out.println("jobId : ");
////						int jobId = input.nextInt();
////						b[t] = new Job(jobId,jobName);
////						a[t] = new Employee(id,name,age,salary,married,b[t]);
//						
//						
//										
//						break;
//					case (2):
//						break;
//					case (3):
//						return;
//					default:
//						System.out.println("moi nhap lai:");
//						break;
//					
//				}
//				
//			}while(true);
//		}
////		public static void createEmployee(Employee a[]){
////			
////		}
////		int id, String name, int age, double salary, boolean married, Job job
//		
//		
//		public static void addEmployee() {
//			System.out.println("may nguoi : ");
//			Scanner input = new Scanner (System.in);
//			int employeeNo = input.nextInt();
//			employees = new Employee[employeeNo];
//			
//		}
	
	public static Scanner scanner = new Scanner(System.in);
	public static int inputNumber = 0;
	public static int employeeNo = 0;
	public static Employee[] employees;
	public static boolean isEndProgram = false;
	public static void main(String[] args) {
		showMenu();
		System.out.println("The program end!!!");
	}
	
	public static void showMenu() {
		do {
			if (isEndProgram) {
				break;
			}
			System.out.println("Choose one numbers below : ");
			System.out.println("1: Create  new Employees");
			System.out.println("2: Show the existing Employees");
			System.out.println("3: exit");
			System.out.println("-------------------------------");
			System.out.println("Type your input number : ");
			inputNumber = scanner.nextInt();
			switch (inputNumber) {
			case 1:
				addEmployee();
				askForContinue();
				break;
			case 2:
				if (employees != null && employees.length > 0) {
					showEmployee();
				} else {
					System.out.println("Please add new employee first!");
					System.out.println("-------------------------------");
				}
				askForContinue();
				break;
			case 3:
				break;
			case 4:
				searchEmployeeByName();
				break;
			case 5:
				updateEmployee();
				break;
			default:
				System.out.println("your input number is wrong, please input again!");
				System.out.println("-------------------------------");
				showMenu();
			}

		} while (inputNumber != 3);
	}
	
	public static void addEmployee() {
		System.out.println("How many employee you want to create? : ");
		employeeNo = scanner.nextInt();
		employees = new Employee[employeeNo];
		for (int i = 0; i < employeeNo; i++) {
			System.out.println("Please input the information of employee[" + i + 1 + "] : ");
			System.out.println("Name : ");
			Scanner scannerName = new Scanner(System.in);
			String name = scannerName.nextLine();
			System.out.println("Salary : ");
			double salary = scanner.nextDouble();
			System.out.println("Age : ");
			int age = scanner.nextInt();
			System.out.println("Job name : ");
			String jobName = scanner.next();
			Employee employee = new Employee(name, i + 1, salary, age, true, new Job(i + 1, jobName));
			employees[i] = employee;
		}
	}
	
	public static void showEmployee() {
		System.out.println("----------------List of employee-----------");
		System.out.println("ID Name             Salary    Job name");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].id + " " + employees[i].name + "       " + employees[i].salary + " " + employees[i].job.name);
		}
	}
	
	public static void askForContinue() {
		System.out.println("Do you want to continue? (Press 3 to end proram, 0 to come back menu) : ");
		int inputNo = scanner.nextInt();
		switch (inputNo) {
		case 0:
			showMenu();
			break;
		case 3:
			isEndProgram = true;
			break;
		default:
			break;
		}
	}
	public static void searchEmployeeByName() {
		System.out.println("Name : ");
		String name = scanner.nextLine();
		for (int i = 0; i < employees.length; i++) {
			if(name == employees[i].name) {
				System.out.println(employees[i].id + " " + employees[i].name + "       " + employees[i].salary + " " + employees[i].job.name);
			}
			System.out.println("Oops sorry! Can't find that employee!");
		}
	}
	public static void updateEmployee() {
		System.out.println("Name : ");
		String name = scanner.nextLine();
		System.out.println("Salary change : ");
		Double salary = scanner.nextDouble();
		for (int i = 0; i < employees.length; i++) {
			if(name == employees[i].name) {
				employees[i].salary = salary;
				}
			System.out.println("Oops sorry! Can't find that employee!");
			}
		
		
	}

		
	}



