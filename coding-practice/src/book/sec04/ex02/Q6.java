package book.sec04.ex02;

public class Q6 {
	public static void main(String[] args) {
		// 별 출력하기 2
//		    *
//		   **
//		  ***
//		 ****
		
		// 방법 1
		for (int i = 1; i <= 4; i++) {
			System.out.println(" ".repeat(4-i) + "*".repeat(i));
		}
		System.out.println("--------");
		// 방법 2
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
