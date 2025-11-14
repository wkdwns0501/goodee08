package homework.loop;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		// 1~n 까지의 합 구하기
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while (true) {
			System.out.print("정수(1~50) : ");
			int input = sc.nextInt();
			if (input < 1 || input > 50) {
				System.out.println("1~50사이의 정수를 입력하세요.");
				continue;
			} else {
				for (int i = 1; i <= input; i++) {
					if (i % 2 == 0) sum += i;
				}
				break;
			}
		}
		
		System.out.println("합계 : " + sum);
		sc.close();
	}
}
