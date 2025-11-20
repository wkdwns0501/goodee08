package homework02.controller;

import homework02.model.GreenTea;

public class GreenTeaController {
	GreenTea gt = new GreenTea();
	
	public String bakeGreenTeaCake(double flour, double cream, double powder, int cheese) {
		gt.setFlour(flour);
		gt.setCream(cream);
		gt.setPowder(powder);
		gt.setCheese(cheese);
		return gt.toString() + "녹차 케이크가 완성되었습니다.";
	}
}
