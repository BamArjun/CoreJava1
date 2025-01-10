package controlstatement;

import java.util.Scanner;

public class LadderTest {
	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your charcter");
		ch= sc.next().charAt(0);
		if (ch>='A'&& ch<='Z') {
			System.out.println("upperletter");
		}
		else if (ch>='a'&& ch<='z') {
			System.out.println("lower case");
			
		}
		else if (ch>='0'&& ch<='9') {
			System.out.println("Digits/ numerical value");
		}
		else {
			System.out.println("special character");
		}
	}

}
