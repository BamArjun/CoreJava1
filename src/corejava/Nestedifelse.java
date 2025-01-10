package corejava;
import java.util.*;
public class Nestedifelse {
	public static void main(String[] args) {
		String citizen ;
		int age;
		boolean haveVoterId = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter citizen");
		System.out.println("enter your age");
		citizen = sc.next();
		age = sc.nextInt();
		if (citizen.equals("nepali")) {

			if (age >= 18) {
				if (haveVoterId) {
					System.out.println("you can vote.");
				} else {

					System.out.println("you don't have voterid");
				}
			} else {
				System.out.println("you are under age");
			}
		} else {
			System.out.println("invalid citizenship");
		}
	}
}