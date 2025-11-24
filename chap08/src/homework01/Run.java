package homework01;

public class Run {
	public static void main(String[] args) {
		SmartPhone[] myPhones = new SmartPhone[2];
		myPhones[0] = new GalaxyS24();
		myPhones[1] = new Iphone15();
		
		for (SmartPhone phone : myPhones) {
			phone.printMaker();
			phone.makeCall();
			phone.takeCall();
			phone.touch();
			phone.charge();
			phone.picture();
			System.out.println();
		}
		
	}
}
