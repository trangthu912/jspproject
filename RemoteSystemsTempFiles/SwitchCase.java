package Lab2;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap : ");
		int a = input.nextInt();
		System.out.println("So ban input : " + a);
//		System.out.println(print(a));
		
		switch (a){
			case 1:
					System.out.println("create employee");
					break;
			case 2:
					System.out.println("show the existing employee");
					break;
			case 3:
					System.out.println("exit");
					break;
						

	
		
		}
		
		
	}

}
