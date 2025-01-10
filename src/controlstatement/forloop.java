package controlstatement;

import java.util.Iterator;
import java.util.Scanner;

public class forloop {
	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+ "=" +(num*i));
		}
		System.out.println("multiplication table of"+num);
	}

}
