package homework02;

public class Person {
	private String name;
	private String add;
	public String callNumber;
	public double height;
	public double weight;
	
	public Person(String name, String add, String callNumber, double height, double weight) {
		this.name = name;
		this.add = add;
		this.callNumber = callNumber;
		this.height = height;
		this.weight = weight;
	}
	
	public void printCallNumAndHAndW() {
		System.out.println(this.callNumber + ", " + this.height + ", " + this.weight);
	}
	
}
