package sec03.exam02;

import java.util.Scanner;

public class CastingEx {
	public static void main(String[] args) {
		int intValue = 44032; // 가
//		int intValue = 65601; // A
		char charValue = (char) intValue;
		System.out.println(charValue);
		
//		long longValue = 500;
		long longValue = 20000000000L;
		intValue = (int) longValue; // 강제 형변환 시 마지막 4byte만 넣음
		System.out.println(intValue); 
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; // 정수 부분만 저장
		System.out.println(intValue);
		
		// Quiz
		// long 타입을 입력받아 변수 number에 저장 후
		// number 변수의 값을 int 타입으로 변환한 결과를 출력하시오
		Scanner scanner = new Scanner(System.in);
		System.out.print("long 타입 입력: ");
		int number = (int) scanner.nextLong();
		System.out.println(number);
	}
}
