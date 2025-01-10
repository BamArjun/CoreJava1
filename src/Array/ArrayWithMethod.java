package Array;
import java.util.*;
import java.lang.reflect.Array;

public class ArrayWithMethod {
	/*
	 * --------------array with method-------
	 * a.Array as arguments
	 * void sum(int a[]);{}
	 * 
	 * 
	 * 
	 * b.Array as return value.
	 * 
	 * int[] get20Intvalue(){
	 //array=2,3,,45,,5,6,7,7,8,8,,;
	 * return 300;
	 * }
	 * 
	 * 
	 */
public static void main(String[] args) {
	//int[] array= {1,2,3,4,5,6,7,8,9};
	//sum(array);
	int []oddno=getOddNoFrom1to100();
System.out.println(Arrays.toString(oddno));
}
static // array as argument
void sum(int values[]) {
	int s=0;
	for (int x:values) {
		s=s+x;
	}
	System.out.println("total="+s);
}
// array has return type.
static int[] getOddNoFrom1to100() {
	int []oddno= new int[50];
	int j=0;
	for(int i=1;i<=100;i++) {
		if(i%2!=0) {
			oddno[j]=i;
			j++;
		}
	}
	return oddno;
}
}
