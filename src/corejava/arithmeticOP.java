package corejava;
import java.util.Scanner;
public class arithmeticOP {
	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		char op;
		System.out.println("enter the operation '+,-,*,/'");
		op = sc.next().charAt(0);
		switch(op) {
		case '+':
			System.out.println("sum ="+(num1+num2));
			break;
		case('-'):
			System.out.println("difference ="+(num1-num2));
		break;
		case('*'):
			System.out.println("multiplication ="+(num1*num2));
		break;
		case('/'):
			System.out.println("division ="+(num1/num2));
		break;
		default:
			System.out.println("invalid operation");
		
		}
	}

}
