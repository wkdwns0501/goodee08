package sec01.quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
//		Quiz
//		원본 문자열과 삭제할 문자들을 입력 받아 실행 클래스의 deleteChar 메소드를 구현하시오.
//		deleteChar(String 원본문자열, String 삭제문자열) 메소드는 원본 문자열에서 삭제 문자열에 속한 문자를 제거하고 
//		남는 문자열을 리턴하는 메소드입니다.
//		※ 참고: 정적(static) 메소드 안에서 인스턴스 메소드를 쓸 수 없습니다.
		
//		[입력]
//		1) 1,2-3 ,-!
//		2) 1a2b3 12345
		
//		[출력]
//		1) 123
//		2) ab		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열, 삭제할 문자 입력: ");
		String input = sc.next();
		String delete = sc.next();
		
		System.out.println(deleteChar(input, delete));
		sc.close();
		
	}
	
	public static String deleteChar(String str, String deleteStr) {
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < deleteStr.length(); j++) {
				if (str.charAt(i) == deleteStr.charAt(j)) {
					sb.replace(i, i+1, " ");
				}
			}
		}
		for (int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == ' ') {
				sb.delete(i, i+1);
			}
		}
		return sb.toString();
	}
	
}
