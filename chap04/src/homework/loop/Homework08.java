package homework.loop;

import java.util.Scanner;

public class Homework08 {
	public static void main(String[] args) {
		// 문자열의 문자 개수 구하기
		Scanner sc = new Scanner(System.in);
		
		Outter : while (true) {
			int count = 0;
			System.out.print("문자열 : ");
			String input1 = sc.nextLine();
			System.out.print("문자 : ");
			char input2 = sc.nextLine().charAt(0);
			for (int i = 0; i < input1.length(); i++) {
				if (input1.charAt(i) == input2) {
					count++;
				}
			}
			System.out.println("포함된 개수 : " + count);
			Inner : for (;;) {
				System.out.print("다시 입력하시겠습니까? : ");
				String input3 = sc.nextLine();
//				if (input3.equals("N") || input3.equals("n")) {
				if ("n".equalsIgnoreCase(input3)) {
					System.out.println("프로그램 종료");
					break Outter; // return;
				} else if (input3.equals("Y") || input3.equals("y")) {
					continue Outter;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
					continue Inner;
				}
			}
		}
		sc.close();
	}
}
