package homework.condition;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("각 과목의 점수를 입력하세요.");
		System.out.print("소프트웨어설계 점수: ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("소프트웨어개발 점수: ");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.print("데이터베이스구축 점수: ");
		int c = sc.nextInt();
		sc.nextLine();
		System.out.print("프로그래밍언어활용 점수: ");
		int d = sc.nextInt();
		sc.nextLine();
		System.out.print("정보시스템구축관리 점수: ");
		int e = sc.nextInt();
		
		double avg = (a + b + c + d + e) / 5.0;
		if ((a >= 40 || b >= 40 || c >= 40 || d >= 40 || e >= 40) && avg >= 60 ) {
            System.out.println("평균 점수: " + avg);
            System.out.println("합격을 축하합니다!");
		} else {
			if (a < 40) {
                System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
            } else if (b < 40) {
                System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
            } else if (c < 40) {
                System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
            } else if (d < 40) {
                System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
            } else if (e < 40) {
                System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
            } else {
                System.out.println("평균 점수 60점 미만으로 불합격입니다.");
            }
		}
		
		sc.close();
	}
}
