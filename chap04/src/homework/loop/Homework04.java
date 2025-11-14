package homework.loop;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		// 게임 재시작
		Scanner sc = new Scanner(System.in);
		
		String input = null;
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			input = sc.nextLine();
			if(input.equals("no")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		} while (input.equals("yes"));
		
		sc.close();
	}
}
