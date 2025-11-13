package homework.condition;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("세 번째 정수 : ");
		int num3 = sc.nextInt();
		int minNum = num1;
		if (num2 < minNum) {
			minNum = num2;
		}
		if (num3 < minNum) {
			minNum = num3;
		}
		
		System.out.println("세 수 중에서 가장 작은 수는 " + minNum + "입니다.");
		sc.close();
	}
}
