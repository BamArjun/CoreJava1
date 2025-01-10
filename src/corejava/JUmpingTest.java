package corejava;

public class JUmpingTest {
	/*
	 jumping statement
	 a:break;     exiting from loop
	 b:continue;  skip values 
	 c:return;    exit from method.
	 */
	public static void main(String[] args) {
		for(int i=1; 1<=10; i++)
		{
			if(i==5) {
			break;
			//continue;	
			}
			System.out.println(i);
		}
		//System.out.println("end of loop");
	}

}
