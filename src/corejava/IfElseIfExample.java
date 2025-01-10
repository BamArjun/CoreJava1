package corejava;

import java.util.Scanner;

public class IfElseIfExample {

	public static void main(String[] args) {

		int percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the percentage:");
		percentage = sc.nextInt();
		if (percentage >= 90) {
			System.out.println("you obtain : A+");
		} else if (percentage >= 80) {
			System.out.println("you obtain: A");
		} else if (percentage >= 70) {
			System.out.println("you obtain: B+");
		} else if (percentage >= 60) {
			System.out.println("you obtain: B");
		} else {
			System.out.println("you are fail");
		}
	}

}