package sec01.exam07;

public class ExitEx {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				// JVM을 강제 종료
				System.exit(0); // 0: 정상 종료를 의미
//				break; // 가장 가까운 반복문 종료
//				return; // 가장 가까운 메소드 종료
			}
		}
		System.out.println("마무리 코드");
		
	}
}
