package controlstatement;

import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[] args) {
		String citizen;
		int age;
		boolean haveVoterId=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your citizenship");
		citizen= sc.next();
		System.out.println("enter your age");
		age=sc.nextInt();
		if (citizen.equals("nepali")) {
			if (age>=18) {
				if (haveVoterId) {
					System.out.println("you can vote.");
				} 
				
			}else {
				System.out.println("you cannot vote");
			}
			
		} else {
System.out.println("invalid citizenship");
		}
		
		
	}

}
