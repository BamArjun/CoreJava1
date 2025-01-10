package method;

import java.util.Scanner;

public class MethodTest {
	public static void main(String[] args) {
	//System.out.println("sum="+sum());	
	exchange();	
	sum();
	}
static void sum() {
	int a;
	int b;
	int add;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the value of a");
	a=sc.nextInt();
	System.out.println("enter the value of b");
	b=sc.nextInt();
	 add=a+b;
	//return a+b;
	System.out.println("SUM="+add);
	
}
static void exchange() {
int doller;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the doller.");
doller=sc.nextInt();
int nrp=doller*132;
System.out.println("NRP:"+nrp);
	
}
}
