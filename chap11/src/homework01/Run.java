package homework01;

public class Run {
	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		String[] strArray = str.split("\n");
		
		for (int i = 0; i < strArray.length; i++) {
			String[] arr = strArray[i].split(",");
			
			String name = arr[0];
			int age = Integer.parseInt(arr[1]);
			String address = arr[2];
			char gender = arr[3].charAt(0);
			
			Person person = new Person(name, age, address ,gender);
			System.out.println(person.toString());
		}
		
	}
}
