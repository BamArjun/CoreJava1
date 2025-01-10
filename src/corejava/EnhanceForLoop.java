package corejava;

public class EnhanceForLoop {
	/*
	 syntax:
	 for(data_type var: colection){
	 //statemennt
	 }
	 */
	public static void main(String[] args) {
		int values[]= {1,2,3,4,5,22,33};
		int s=0;
		for(int x:values) {
			System.out.println(x);
			s=s+x;
			
		}
		System.out.println("total sum"+s);
	}

}
