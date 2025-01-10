package corejava;
import java.util.Scanner;
public class Oddeven {
	public static void main(String[] args) {
		int num=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
	}

}
