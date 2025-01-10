package corejava;
import java.util.Scanner;

public class SI {
public static void main(String[] args) {
	int SI=0;
	int p,t,r;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the principle,time,rate");
	p=sc.nextInt();
	t=sc.nextInt();
	r=sc.nextInt();
	if(p!=0&& t!=0&&r!=00 ) {
		SI=(p*t*r)/100;
	}
System.out.println("the SI is :"+SI);
}
}
