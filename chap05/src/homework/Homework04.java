package homework;

import java.util.Arrays;

public class Homework04 {
	public static void main(String[] args) {
		// 로또 번호 자동 생성기
		
		// 내 풀이
		int[] lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
		        if (lotto[i] == lotto[j]) {
		            i--;
		            break;
		        }
		    }
		}
		Arrays.sort(lotto);
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		// 강사님 풀이
		int count = 0; // 로또 번호를 하나 넣을 때마다 1씩 증가
		
		while (count < lotto.length) {
			int num = (int) (Math.random() * 45) + 1; // 1~45
			
			// 중복 체크
			boolean duplicate = false;
			for (int i = 0; i < count; i++) { // 실제 로또 번호가 들어간 count까지만 체크
				if (lotto[i] == num) {
					duplicate = true;
					break; // 중복되는 값을 찾는 즉시 빠져나감
				}
			}
			
			// 중복이 아니면 배열에 저장
			if (!duplicate) {
				lotto[count] = num;
				count++;
			}
		}
		
		// 오름차순 정렬
		Arrays.sort(lotto);
		
		for (int num : lotto) {
            System.out.print(num + " ");
        }
		
	}
}
