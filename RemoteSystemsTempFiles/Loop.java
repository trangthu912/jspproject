package Lab3;

public class Loop {
		public static void main(String [] args) {
			int s = 0 , i = 0;
			
			do {
				s += i;
				i++;
			}while(i<=10);
			System.out.println("Sum of 0 to 10 is : " + s);
		}
}
