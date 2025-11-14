package homework.loop;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		// 구구단 n단 출력하기
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			if (num < 0) {
				System.out.println("양수만 입력해주세요.");
				continue;
			} else if (num > 9) {
				System.out.println("9이하의 숫자를 입력해주세요.");
				continue;
			} else if (num == 0) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("=== " + num + "단 ===");
				for (int i = 1; i <= 9; i++) {
					int result = num * i;
					System.out.println(num + " * " + i + " = " + result);
				}
			}
		}
		sc.close();
	}
}
