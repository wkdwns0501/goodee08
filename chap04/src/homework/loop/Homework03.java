package homework.loop;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		// 문자열 출력하기
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.print("입력 : ");
			String input = sc.nextLine();
			if (input.equals("탈출")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println(input);
			}
		}
		sc.close();
	}
}
