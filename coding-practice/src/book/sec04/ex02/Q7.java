package book.sec04.ex02;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		// 예금, 출금, 조회, 종료 기능
		
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			int input = Integer.parseInt(sc.nextLine());
			if (input == 1) {
				System.out.print("예금액>");
				balance += Integer.parseInt(sc.nextLine());
			} else if (input == 2) {
				System.out.print("출금액>");
				balance -= Integer.parseInt(sc.nextLine());
			} else if (input == 3) {
				System.out.println("잔고>" + balance);
			} else if (input == 4) {
				break;
			} 
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
}
