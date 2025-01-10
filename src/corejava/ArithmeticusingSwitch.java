package corejava;

public class ArithmeticusingSwitch {
	public static void main(String[] args) {
		  double val1 = 100;
	        double val2 = 10;
	        char operation = 'a';
	        double result = 0;

	        switch (operation) {

	            case 'a':
	                result = val1 + val2; break;

	            case 's':
	                result = val1 - val2; break;
	            case 'd':
	                if (val2 != 0)
	                    result = val1 / val2; break;
	            case 'm':
	                result = val1 * val2; break;

	            default: System.out.println("Not a defined operation");


	        }

	        System.out.println(result);
	    }
	}
