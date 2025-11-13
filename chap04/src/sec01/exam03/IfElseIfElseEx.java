package sec01.exam03;

import java.util.Scanner;

public class IfElseIfElseEx {
	public static void main(String[] args) {
		int score = 75;
		
		// 조건 순서에 주의!
		if (score >= 90) {
			System.out.println("점수가 90이상입니다.");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80이상~90미만입니다.");
			System.out.println("등급은 B 입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70이상~80미만입니다.");
			System.out.println("등급은 C 입니다.");
		} else {
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 D 입니다.");
		}
		
		// 정리
		// 1. 조건식 여러개 작성 가능 (개수 제한 없음)
		// 2. 위에서부터 차례대로 비교하고 조건식이 true가 되는 블록만 실행하고 if문을 빠져나감
		// 3. 필요에 따라 중첩해서 쓸 수 있음
		
		// Quiz
//		한 개의 문자를 입력받아
//		대문자, 소문자, 숫자, 기타문자인지를 출력하는 프로그램을 구현하시오.
//		(문자끼리 대소비교가 가능, 문자 타입이 정수 타입으로 변환됨)
//
//		[입력]   [출력]
//		  A  => 대문자
//		  a  => 소문자
//		  0  => 숫자
//		  가  => 기타문자
		
		Scanner sc = new Scanner(System.in);
		char input = sc.nextLine().charAt(0);
		
		if ((input >= 'A') && (input <= 'Z')) {
			System.out.println("대문자");
		} else if ((input >= 'a') && (input <= 'z')) {
			System.out.println("소문자");
		} else if (input >= '0' && input <='9') {
			System.out.println("숫자");
		} else {
			System.out.println("기타문자");
		}
	}
}
