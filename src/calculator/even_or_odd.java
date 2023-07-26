package calculator;
import java.util.Scanner;
public class even_or_odd {
	public static void main(String args[]) {
		int num;
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter a number");
		num=s.nextInt();
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}
}
	
	

		
	
	
	

