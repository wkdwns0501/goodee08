package homework02;

public class Practice {
	
	public String takeState(String str) {
		String[] strArray = str.trim().split(" ");
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].endsWith("구")) {
				return strArray[i];
			} 
		}
		return null;
	}
	
}
