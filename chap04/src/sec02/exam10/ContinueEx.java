package sec02.exam10;

import java.util.Scanner;

public class ContinueEx {
	public static void main(String[] args) {
		// 짝수만 출력
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) continue; // 홀수인 경우
			System.out.println(i); // 뒤 실행문을 건너뛰고 다음 반복을 계속
		}
		
		// Quiz
//		철수는 여자친구 영희에게 생일 축하 메시지를 보내려고 해요. 
//		그런데 철수의 여자친구 영희는 띄어쓰기를 싫어합니다.
//		철수가 어떤 문자열을 입력하든 영희에게 혼나지 않게
//		글자 사이에 있는 띄어쓰기가 없게 출력해주세요.
//		
//		[입력]
//		영희야 생 일 축 하 해 !
//		
//		[출력]
//		영희야생일축하해!
//		
//		힌트: 
//		- 문자열의 길이를 얻을 때는 length()를 사용, 예: str.length()
		
		Scanner sc = new Scanner(System.in);
		System.out.print("보낼 메세지 입력: ");
		String input = sc.nextLine();
		char inputChar = 0;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ' ') continue;
			inputChar = input.charAt(i);
			System.out.print(inputChar);
		}
		sc.close();
	}
}
