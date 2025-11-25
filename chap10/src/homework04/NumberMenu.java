package homework04;

import java.util.Scanner;

public class NumberMenu {
	
	NumberController nc = new NumberController();
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		try {
			System.out.print(num1 + "은(는) " + num2 + "의 배수인가? " + nc.checkDouble(num1, num2));
		} catch (Exception e) {
			System.out.println("1부터 100사이의 값이 아닙니다.");
			e.printStackTrace();
		}
		sc.close();
	}

}
