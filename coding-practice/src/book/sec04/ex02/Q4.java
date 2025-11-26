package book.sec04.ex02;

public class Q4 {
	public static void main(String[] args) {
		// 4x + 5y = 60 의 모든 해 구하기
		
		for (int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if (4 * i + 5 * j == 60) {
					System.out.println("(" + i +", " + j + ")");
				}
			}
		}
	}
}
