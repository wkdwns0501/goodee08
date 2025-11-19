package homework07;

public class Rectangle {
	int width = 1;
	int height = 1;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int calculateRound() {
		int result = width * 2 + height * 2;
		return result;
	}
	
	public int calculateArea() {
		int result = width * height;
		return result;
	}
	
	public void printInfo() {
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사각형의 둘레");
		System.out.println(calculateRound() + "cm");
		System.out.println("2. 사각형의 넓이");
		System.out.println(calculateArea() + "cm");
	}
	
}
