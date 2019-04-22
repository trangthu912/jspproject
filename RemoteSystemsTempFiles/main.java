package Lab5;

import java.util.Scanner;

public class main {
	public static void main (String [] args) {
		
	}
	public static void menu() {
		do{
			System.out.println("MENU");
			System.out.println("1.Create employee");
			System.out.println("2.Show the existing employee");
			System.out.println("3.exit");
			System.out.println("==============================");
			Scanner input = new Scanner (System.in);
			System.out.println("Nhap : ");
			int n = input.nextInt();
			int t = 0 ;
			switch(n) {
				case (1):
					Employee[] a;
					Job[] b;
					System.out.println("id : ");
					int id = input.nextInt();
					System.out.println("name : ");
					String name = input.nextLine();
					System.out.println("age : ");
					int age = input.nextInt();
					System.out.println("salary : ");
					Double salary = input.next;
					System.out.println("married : ");
					String married = input.nextLine();
					System.out.println("jobName : ");
					String jobName = input.nextLine();
					System.out.println("jobId : ");
					int jobId = input.nextInt();
					b[t] = new Job(jobId,jobName);
					a[t] = new Employee(id,name,age,salary,married,b[t]);
					
					
									
					break;
				case (2):
					break;
				case (3):
					break;
				default:
					return;
				
			}
			
		}while(true);
	}
//	public static void createEmployee(Employee a[]){
//		
//	}
//	int id, String name, int age, double salary, boolean married, Job job
	
}
