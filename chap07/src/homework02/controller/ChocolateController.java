package homework02.controller;

import homework02.model.Chocolate;

public class ChocolateController {
	Chocolate c = new Chocolate();
	
	public String bakeChocolateCake(double flour, double cream, int cherry, int chip) {
		c.setFlour(flour);
		c.setCream(cream);
        c.setCherry(cherry);
        c.setChip(chip);
		return c.toString() + "초콜릿 케이크가 완성되었습니다.";
	}
}
