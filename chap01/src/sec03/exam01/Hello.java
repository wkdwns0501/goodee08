package sec03.exam01;

// 1. 각자 테마 변경 및 글자 크기 조정
// 단축키: ctrl + or -

// 2. 주석 사용
// 여기는 모두 주석
/*
 주석
 */
/*
 * 도큐먼트 주석: 도큐먼트 문서 생성하는데 사용
 */
// TODO: Tasks 뷰에 TODO로 메모한 내용 모아보기 (Tasks 추가해서 확인)
public class Hello { // 클래스 선언: 클래스 이름은 대문자로 시작, 반드시 소스 파일의 이름과 동일
	// 프로그램 실행 진입점
	// main 메소드: 자바 프로그램 실행 시 가장 먼저 실행되는 메소드
	public static void main(String[] args) { // 메소드 선언
		// 콘솔에 출려하는 실행문
		System.out.println("Hello Java!");
		// 문자열 내부에는 주석 사용 불가 
		System.out.println("Hello // /**/ Java!");
	}
}
