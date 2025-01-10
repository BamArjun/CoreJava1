package method;

import java.util.Scanner;

public class MiddleChar {
	public static void main(String[] args) {
		String str = "";
		MiddleCharacter(str);
	}
	public static void MiddleCharacter(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.next();
		int len = str.length();//gives string length
		int middle =len/2;
		System.out.println("middle char is:"+str.charAt(middle));
	
	}

}
