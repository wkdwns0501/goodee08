package sec01.exam17;

public class StringLengthEx {
	public static void main(String[] args) {
		String ssn = "9999991234567";
		
		int length = ssn.length();
		
		if (length == 13 ) {
			System.out.println("주번 맞음");
		} else {
			System.out.println("주번 틀림");
		}
	}
}
