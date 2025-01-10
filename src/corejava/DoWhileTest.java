package corejava;

public class DoWhileTest {
	/*
	  syntax:
	 *do{
	 //ststement
	  * inc/dec
	  }
	  while(condition) 
	 * */
	public static void main(String[] args) {
		int n=8;
		int i=1;
		do {
			System.out.println(n+"x"+i+"="+n*i);
		i++	;
		}while(i<=10);
	}

}
