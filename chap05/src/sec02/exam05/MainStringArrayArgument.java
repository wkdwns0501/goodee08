package sec02.exam05;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		System.out.println(args.length);
		
		// 이클립스에서 실행할 때 argument 주는 방법
		// Run Configuration > Arguments
		
		if (args.length != 2) {
			System.out.println("값의 수가 올바르지 않습니다.");
//			return; // 메소드 종료
			System.exit(0); // JVM 강제 종료 코드
			// 여기서 0은 정상 종료를 의미
		}
		int sum = 0;
		int input = 0;
		for (int j = 0; j < args.length; j++) {
			input = Integer.parseInt(args[j]);
			sum += input;
		}
		System.out.println("args배열 요소의 총합: " + sum);
		
	}
}
