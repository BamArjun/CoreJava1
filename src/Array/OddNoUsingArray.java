package Array;

import java.util.Scanner;

public class OddNoUsingArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int odd[] = new int[10];
		for (int i = 0; i < odd.length; i++) {
			odd[i] = sc.nextInt();

		}
		// System.out.println(odd[i]);
		for (int x : odd) {
			if (x % 2 != 0) {
				System.out.println("odd no are"+x);
			}

		}

	}
}
