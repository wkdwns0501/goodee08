package homework03;

import java.util.Scanner;

public class CharacterMenu {
	
	CharacterController cc = new CharacterController();
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		try {
			int cnt = cc.countAlpha(str);
			System.out.println("\'" + str + "\'에 포함된 영문자 개수 : " + cnt);
		} catch (CharCheckException e) {
			System.out.println("체크할 문자열 안에 공백이 포함되어 있습니다.");
			e.printStackTrace();
		}
		sc.close();
	}
}
