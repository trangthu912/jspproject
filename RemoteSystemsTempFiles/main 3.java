package Lab1;

import java.util.Scanner;

public class main {
	public static void main ( String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap a : ");
		int a = input.nextInt();
		System.out.println("Nhap b : ");
		int b = input.nextInt();
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a % b = " + (a%b));
		System.out.println("a / b = " + (a/b));
		System.out.println("a++ = " + (a+1));
		System.out.println("b-- = " + (b-1));
//		String c = (a>b)? "a>b" : "a<=b";
		System.out.println(check(a,b));
	}	
//		public static String check (int a, int b) {
//			If(a>b){
//				return "a>b";
//			
//			}
//			Else{
//				return "a<=b";
//			}
//
//		}
	
	public static String check (int a, int b) {					//** phải có static thì mới có thể gọi ở hàm main mà không cần khỏi tạo hàm ở trên 
		return (a > b) ? "a > b" : "a <= b";
	}
		

		
		
	
}
