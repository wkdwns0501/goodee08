package sec04.exam05.quiz;

public class Rectangle {
	
	int width;
	int height;
	
	void area() {
		int area = this.width * this.height;
		System.out.println("면적: " + area);
	}
	
	void length() {
		int length = this.width * 2 + this.height * 2;
		System.out.println("둘레: " + length);
	}
}
