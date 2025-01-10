package method;

import java.util.Scanner;

public class WithReturnTYpe {
public static void main(String[] args) {
	//int sum=getsum();
	//System.out.println("totalsum =" +sum);
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the value");
	int x= sc.nextInt();
	System.out.println("enter the value");
	int y= sc.nextInt();
	System.out.println("enter the value");
	int z= sc.nextInt();
	Findsmallest(x, y, z);
	System.out.println("The smallest no is:"+Findsmallest(x, y, z));
}
static int getsum() {
	int sum=0;
	for(int i=1;i<=100;i++) {
		sum=sum+i;
	}
	return sum;
}
static int Findsmallest(int x, int y,int z) {

	
	return Math.min(Math.min(x, y),z);
	
}
}
