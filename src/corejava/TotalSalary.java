package corejava;
import java.util.Scanner;
public class TotalSalary {
	public static void main(String[] args) {
		char post = 0 ;
		double totalsalary = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the post");
		post = sc.next().charAt(post);
		switch (post) {
		case 'm':
			System.out.println( totalsalary = 0.20 * 230000 + 230000);
			//System.out.println("total salary of MD:" + totalsalary);
			break;
		case 'c':
			totalsalary = 0.2579 * 250000 +250000;
			System.out.println("total salary of CEO:" + totalsalary);
			break;
		case 'g':
			totalsalary = 0.16 * 176000 + 176000;
			System.out.println("total salary of MANAGER:" + totalsalary);
			break;
		case 'h':
			totalsalary = 0.09 * 145000+ 145000;
			System.out.println("total salary of HELPER:" + totalsalary);
			break;
		default:
			System.out.println("invalid salary");
		}
		//System.out.println(+totalsalary);
	}
}