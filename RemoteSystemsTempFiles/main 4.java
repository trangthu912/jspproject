package inputAndOutput;

import java.util.Scanner;

public class main {
	public static void main(String [] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		String fullName1 = input1.nextLine();						//** tới dấu cách vẫn 
		System.out.println("Your fullname is : " + fullName1);
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		String fullName2 = input1.next();							//** tới dấu cách là không đọc  
		System.out.println("Your fullname is : " + fullName2);
		

		
		
	}

}
