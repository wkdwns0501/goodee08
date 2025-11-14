package homework.loop;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		// 양수만 더하기
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while (true) {
			System.out.print("숫자(0을 입력하면 종료) : ");
			int input = sc.nextInt();
			if (input == 0) break;
			else if (input < 0) continue;
			else {
				sum += input;
			}
		}
		
		System.out.println("양수의 합계 : " + sum);
		sc.close();
	}
}
