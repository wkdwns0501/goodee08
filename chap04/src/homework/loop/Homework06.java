package homework.loop;

public class Homework06 {
	public static void main(String[] args) {
		// 트리 만들기
		//	     *           	// 빈칸 4칸, * 1개
		//	    ***   			// 빈칸 3칸, * 3개
		//	   *****  		// 빈칸 2칸, * 5개
		//	  ******* 		// 빈칸 1칸, * 7개
		//	 *********		// 빈칸 0칸, * 9개
		for (int i = 0; i < 5; i++) { // 5줄
			for (int j = 0; j < 9; j++) { // 9칸
				// 시작 인덱스 이상이면서 끝 인덱스 이하
				if(j >= 4-i && j <= i+4) { 
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
