package book.sec04.ex02;

public class Q5 {
	public static void main(String[] args) {
		// 별 출력하기 1
//		 	*
//		 	**
//		 	***
//		 	****
		
		// 방법 1
		for (int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("--------");
		// 방법 2
		for (int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				if (j == i) System.out.println(" ");
			}
		}
		
	}
}
