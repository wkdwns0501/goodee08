package sec05.exam02_1;

public class CalculatorEx {
	public static void main(String[] args) {
		// 반지름이 10cm인 원의 넓이 구하기
		
		// 잘못된 접근 방식 (굳이 메모리를 낭비하는 방식)
//		Calculator myCalc = new Calculator();
//		double result1 = 10 * 10 * myCalc.pi;
		
		// static 접근 방식 (클래스명.메소드())
		double result1 = 10 * 10 * Calculator.pi; // Math.PI
		System.out.println("result1: " + result1);
		
		int result2 = Calculator.plus(1, 2);
		System.out.println("result2: " + result2);
		
		int result3 = Calculator.minus(2, 1);
		System.out.println("result3: " + result3);
		// (참고) static 메소드는 주로 유틸리티성 기능에 쓰임 
		
	}
}
