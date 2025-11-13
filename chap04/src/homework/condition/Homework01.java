package homework.condition;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		int total;	
		if (age < 3) {
		    total = 0;
		} else if (age <= 12) {
		    total = 10000;
		} else if (age <= 18) {
		    total = 20000;
		} else if (age <= 64) {
		    total = 30000;
		} else {
		    total = 0;
		}
		
		System.out.println("당신의 놀이동산 요금은 " + total + "원 입니다.");
		sc.close();
	}
}
