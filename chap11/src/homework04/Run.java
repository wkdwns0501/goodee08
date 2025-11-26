package homework04;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String result = "";
		while (true) {
			System.out.print("문자열 : ");
			char input = sc.nextLine().charAt(0);
			if ("n".equalsIgnoreCase(input+"")) {
				System.out.println("프로그램을 종료합니다.");
				System.out.print("최종 문자열 : ");
				System.out.println(result);
				break;
			}
			result += input;
		}
		sc.close();
	}
}
