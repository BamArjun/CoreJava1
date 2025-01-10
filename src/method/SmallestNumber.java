package method;

import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        System.out.print("Input the first number: ");
	        double x = in.nextDouble();
	        System.out.print("Input the Second number: ");
	        double y = in.nextDouble();
	        System.out.print("Input the third number: ");
	        double z = in.nextDouble();
	        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
	        System.out.print("The max num value is " + maximum(x, y, z)+"\n" );

	}
static double smallest(double x,double y, double z) {
	return Math.min(Math.min(x, y), z);
}
static double maximum(double x, double y,double z) {
	return Math.max( Math.max(y, z),x);
	
}
}
