package vd1;

public class main {
	public static void main(String agrs[]) {
//		Employee[] employee = new Employee[5];
//		employee[0] = new Employee (1, "Nguyen Van A" , 30 , 3000 , "HR");
//		System.out.println(employee[0].id + employee[0].name + employee[0].age + employee[0].salary + employee[0].job.name);
		
		Job job1 = new Job(1,"HR");
		Job job2 = new Job(2,"BA");
		Job job3 = new Job(3,"Tester");
		Job job4 = new Job(4,"Developer");
		Job job5 = new Job(5,"CEO");
		Employee employee1 = new Employee (1 , "Nguyen Van A" , 30 , 3000 ,true, new Job(1,"HR"));			//***
		Employee employee2 = new Employee (2 , "Nguyen Van B" , 30 , 4000 ,true, job1);					
		Employee employee3 = new Employee (3 , "Nguyen Van C" , 30 , 5000 ,true, job1);
		Employee employee4 = new Employee (4 , "Nguyen Van D" , 30 , 6000 ,true, job1);
		Employee employee5 = new Employee (5 , "Nguyen Van E" , 30 , 7000 ,true, job1);
		
		Employee[] employees = new Employee[5];
		employees[0] = employee1;		
		employees[1] = employee2;		
		employees[2] = employee3;		
		employees[3] = employee4;		
		employees[4] = employee5;
		System.out.println("size : " + employees.length + " phan tu ");
		System.out.println("ID      " + "NAME       " + "AGE   " + "SALARY  " + "JOB NAME    ");
		for(int n = 0 ; n < employees.length ; n++) {
//			System.out.println( employees[employees.length-1].id + "   "+ employees[4].name + "   " + employees[4].age + "    " + employees[4].salary + "    " +employees[4].job.name );
			System.out.println( employees[n].id + "   "+ employees[n].name + "   " + employees[n].age + "    " + employees[n].salary + "    " +employees[n].job.name );
		}
		
	}
}
