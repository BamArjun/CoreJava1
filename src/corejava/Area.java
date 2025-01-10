package corejava;
import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		
		int Area=0;
		int l;
		int b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the length and breadth");
		l=sc.nextInt();
		b=sc.nextInt();

		if(l!=0&&b!=0) {
			Area=l*b;
			
		}
		System.out.print("The area is :"+Area);
		
	}

}
