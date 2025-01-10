package controlstatement;

import java.util.Scanner;

public class salaryincIf {
	public static void main(String[] args) {
	
	int salary;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the salary:");
	salary=sc.nextInt();
	if (salary<50000) {
		salary=salary+10000;
	}
	System.out.println("total salary:"+salary);
	}
}
