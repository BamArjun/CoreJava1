package method;

public class StringReverse {
	public static void main(String[] args) {
		String OriginalString="Arjun Bam";
		String reverseString="";
		//here we use string builder for efficient string manupliation
		StringBuilder sb= new StringBuilder(OriginalString);
		sb.reverse();
	//	sb.replace(1, 3, reverseString);
		reverseString=sb.toString();
		System.out.println("OS:::"+OriginalString);
		System.out.println("RS:::"+reverseString);
	}

}
