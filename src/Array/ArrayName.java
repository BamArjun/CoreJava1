package Array;
import java.util.Scanner;
public class ArrayName {
	public static void main(String[] args) {
		String name[]=new String[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<name.length;i++) {
			System.out.println("enter the name");
			name[i]=sc.next();
		}
		for(String x:name) {
			System.out.println(x);
		}
	}

}
