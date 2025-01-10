package Array;

import java.util.Scanner;

public class MultiDimensionArray {
	/*
	 * ------multidimensional array------------
	 * used to manage data in row and column for matrix or tabular form
	 * 
	 * syntax:
	 * data_type array_name[][]=new data_type[row][col];
	 */
public static void main(String[] args) {
	//creat
	int math[][]=new int[2][2];
	//write
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
		System.out.println("enter the value");
		math[i][j]=sc.nextInt();
		}
	}
	
	//read
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			System.out.print(math[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
