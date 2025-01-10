package corejava;

public class loopFor {
public static void main(String[] args) {
	int esum=0;
	int osum=0;
	for(int i=0;i<=100;i++)
	{
		if(i%2==0) {
		esum=esum+i;
	//System.out.println(i);
}
		else
			osum=osum+i;
		}
System.out.println(+esum);
System.out.println(+osum);


}
}