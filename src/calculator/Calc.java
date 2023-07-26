package calculator;
import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operand;
		int n1,n2;
		int sum;
		Scanner s=new Scanner(System.in);
		System.out.println("enter ur operand to perform: +,-,*,/");
		operand=s.next().charAt(0);
		System.out.println("enter ur first number");
		n1=s.nextInt();
		System.out.println("enter ur second number");
		n2=s.nextInt();
		switch(operand) {
		case '+':
			sum=n1+n2;
			System.out.println(n1+"+"+n2+"="+sum);
			break;
		case'-':
			sum=n1-n2;
			System.out.println(n1+"-"+n2+"="+sum);
			break;
		case'*':
			sum=n1*n2;
			System.out.println(n1+"*"+n2+"="+sum);
			break;
		case'/':
			sum=n1/n2;
			System.out.println(n1+"/"+n2+"="+sum);
			break;
		default:
			System.out.println("invalid operand");
			break;
			
			
			
		}
		
		
		
		
		

	}

}
