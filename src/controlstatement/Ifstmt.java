package controlstatement;

import java.util.Scanner;

public class Ifstmt {
	public static void main(String[] args) {
		int area=0;
		int l;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length and breadth");
		l=sc.nextInt();
		b= sc.nextInt();
		if (l!=0&&b!=0) {
			area=l*b;
			}
		System.out.println("Area="+area); {
			
		}
	}

}
