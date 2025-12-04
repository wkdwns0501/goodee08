package sec01.exam06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx {
	public static void main(String[] args) {
		
		try (InputStream is = new FileInputStream("C:/Temp/test3.txt")) {
			byte[] buffer = new byte[5]; // 0 0 20 30 40
			int readByteNum = is.read(buffer, 2, 3);
			if (readByteNum != -1) {
				for (int i = 0; i < readByteNum; i++) {
					System.out.println(buffer[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
