package Array;

import java.util.Scanner;

public class ArrayAvgofPricebook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bookprice[] = new int[3];
		int total=0;
		for (int i = 0; i < bookprice.length; i++) {
			System.out.println("enter the Book price.");
			bookprice[i] = sc.nextInt();
			total +=bookprice[i];
			
		}
		System.out.println("total price ="+total);
		float avg=total/3;
		System.out.println("Average ="+avg);

		/*for (int x : bookprice) {
			int avg;
			int total = x + x;
			avg = total / 3;
			System.out.println("total=" + total);
			System.out.println("Average=" + avg);


		}
*/
	}

}
