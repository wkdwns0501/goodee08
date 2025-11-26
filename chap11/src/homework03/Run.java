package homework03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 입력: ");
		String email = sc.nextLine().trim();
		
		boolean pass = email.endsWith("@goodee.co.kr");
		String[] id = email.split("@");
		if (pass == false) {
			System.out.println("유효하지 않은 이메일입니다.");
		} else {
			System.out.println(id[0].toUpperCase());
		}
		sc.close();
	}
}
