package sec01.exam07;

public class SwitchCharEx {
	public static void main(String[] args) {
		char grade = 'a';
		
		// char 타입 변수도 올 수 있다. (대소문자 구분)
		switch (grade) {
			case 'A', 'a':
				System.out.println("우수 회원");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원");
				break;
			default:
				System.out.println("손님");
				break;
		}
		
		// Quiz
//		위 switch문을 if문으로 변경해보세요.
		
		if (grade == 'A' || grade == 'a') {
			System.out.println("우수 회원");
		} else if (grade == 'B' || grade == 'b') {
			System.out.println("일반 회원");
		} else {
			System.out.println("손님");
		}
	}
}
