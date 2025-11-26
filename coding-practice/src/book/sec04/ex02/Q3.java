package book.sec04.ex02;

public class Q3 {
	public static void main(String[] args) {
		// 주사위 2개를 계속 던져서 눈의 합이 5가 되면 종료
		
		while (true) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + dice1 +", " + dice2 + ")");
			if (dice1 + dice2 == 5) break;
		}
		System.out.println("눈의 합이 5가 되어 종료");
	}
}
