package sec04.exam04;

import java.io.IOException;

public class QStopEx {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
			// q 를 입력하면 종료되도록 만들기 (q의 키코드 113)
			if (keyCode == 'q') break;
			System.out.println("keyCode: " + keyCode);
			
		}
		System.out.println("종료");
	}
}
