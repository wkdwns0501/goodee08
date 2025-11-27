package sec01.quiz;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
//		Quiz
//		반 전체 학생이 몇 명인지 입력을 받아 배열을 만들고,
//		우리반 학생들 이름을 입력받아서 모두의 이름을 배열에 추가합니다.
//		전체 학생 중에서 오늘 커피 쏠 사람을 랜덤으로 뽑으려고 해요.
//		Math.random()을 활용해서 학생 한 명을 추출하여 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반 전체 학생 수 입력: ");
		int input = sc.nextInt();
		sc.nextLine();
		
		String[] nameArr = new String[input];
		for (int i = 0; i < nameArr.length; i++) {
			System.out.print("학생 이름 입력: ");
			String name = sc.nextLine();
			nameArr[i] = name;
		}
		
		int random = (int) (Math.random() * input-1) + 1;
		System.out.println(nameArr[random] + " 당첨!");
		sc.close();
		
	}
}
