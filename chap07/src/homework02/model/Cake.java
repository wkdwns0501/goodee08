package homework02.model;

public class Cake {
	double flour;
	double cream;
	
	public double getFlour() {
		return flour;
	}

	public void setFlour(double flour) {
		this.flour = flour;
	}

	public double getCream() {
		return cream;
	}

	public void setCream(double cream) {
		this.cream = cream;
	}

	public Cake() {
		
	}	
	
	public Cake(double flour, double cream) {
		this.flour = flour;
		this.cream = cream;
	}
	
	@Override
    public String toString() {
        return "밀가루 : " + flour + "(g)\n"
             + "크림 : " + cream + "(g)\n";
    }
	
}
