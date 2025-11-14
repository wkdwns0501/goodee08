package homework.loop;

import java.util.Scanner;

public class Homework07 {
	public static void main(String[] args) {
		// 입력값 만큼 '박' '수' 출력하기
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수 : ");
			int input = sc.nextInt();
			if (input <= 0) {
				System.out.println("양수가 아닙니다.");
				continue;
			} else {
				for (int i = 1; i <= input; i++) {
					if(i % 2 == 1) System.out.print("박");
					else System.out.print("수");
				}
				break;
			}
		}
		sc.close();
	}
}
