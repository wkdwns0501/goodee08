package book.sec04.ex02;

public class Q2 {
	public static void main(String[] args) {
		// 1부터 100까지 3의배수의 총합 구하기
		
		int sum = 0;
		// 방법 1
		for (int i = 3; i <= 100; i+=3) {
			sum += i;
		}
		// 방법 2
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				sum += i;
//			}
//		}
		System.out.println(sum);
	}
}
