package method;

import java.util.Scanner;

public class SIandAmountRT {
	public static void main(String[] args) {
		input();
	}
static void input() {
	int p,t,r;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter p: t: r:");
	p=sc.nextInt();
	t=sc.nextInt();
	r=sc.nextInt();
	process(p, t, r);
}
static void process(int p, int t, int r) {
	int SI=(p*t*r)/100;
	int amount=p+SI;
	output(SI, amount);
}
static void output(int SI,int amount) {
	System.out.println("The simple interest :"+SI);
	System.out.println("the amount is :"+amount);
}
}
