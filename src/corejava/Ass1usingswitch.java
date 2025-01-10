package corejava;
import java.util.Scanner;
public class Ass1usingswitch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char post ;
	System.out.println("enter the post");
	post = sc.next().charAt(0);
	switch(post) {
	case 'M':
		System.out.println("TOTAL SALARY of MD="+(230000+(230000*20)/100));
		break;
	case 'C':
		System.out.println("TOTAL SALARY of CEO ="+(250000+(250000*25.79)/100));
		break;
	case 'G':
		System.out.println("TOTAL SALARY of MANAGER ="+(1760000+(176000*16)/100));
		break;
	case 'H':
		System.out.println("TOTAL SALARY OF HELPER ="+(145000+(145000*19)/100));
		break;
		default:
			System.out.println("invalid post");
			
	}
	
}

}
