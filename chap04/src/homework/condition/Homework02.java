package homework.condition;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		sc.nextLine();
		System.out.print("기온 : ");
		int temp = sc.nextInt();
		
		if (month < 1 || month > 12) {
            System.out.println("해당하는 계절이 없습니다.");
        } else {
            if (month == 3 || month == 4 || month == 5) { 
                System.out.println("봄");
            } else if (month == 6 || month == 7 || month == 8) {
                System.out.print("여름");
                if (temp >= 35) {
                    System.out.println(" 폭염 경보");
                } else if (temp >= 33) {
                    System.out.println(" 폭염 주의보");
                } else {
                    System.out.println(); 
                }
            } else if (month == 9 || month == 10 || month == 11) { 
                System.out.println("가을");
            } else { 
                System.out.print("겨울");
                if (temp <= -15) {
                    System.out.println(" 한파 경보");
                } else if (temp <= -12) {
                    System.out.println(" 한파 주의보");
                } else {
                    System.out.println(); 
                }
            }
        }
		
		sc.close();
	}
}
