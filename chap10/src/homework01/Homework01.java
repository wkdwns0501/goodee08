package homework01;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		int randomValue = (int) (Math.random() * 50) + 1;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			int num = 0;
			System.out.print("1~50 사이의 숫자 : ");
			try {
				num = sc.nextInt();
				sc.nextLine();
				count++;
				if (num == randomValue) {
					System.out.println("축하합니다~ 정답이에요! 총 시도 횟수: " + count);
					break;
				}
				else if (num > randomValue) {
					System.out.println("Down!");
				} else {
					System.out.println("Up!");
				}
			} catch (Exception  e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
				sc.nextLine();
			}
		}
		sc.close();
	}
}
