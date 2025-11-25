package homework04;

public class NumberController {

	public NumberController() {
		super();
	}
	
	public boolean checkDouble(int num1, int num2) throws NumberRangeException {
		if (num1 >= 1 && num1 <= 100 && num2 >= 1 && num2 <= 100) {
			if (num1 % num2 == 0) return true;
			else return false;
		} else {
			throw new NumberRangeException();
		}
	}
	
}
