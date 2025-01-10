package Array;
import java.util.Scanner;
public class ArrayTest {
public static void main(String[] args) {
	//store ageof 5 student.
	int age[]=new int[5];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<age.length;i++) {
		System.out.println("enter the array valuea");
		age[i]=sc.nextInt();
	//age[0]=12;
	}
	for(int x:age){
		System.out.println(x);
	} 
	}
}