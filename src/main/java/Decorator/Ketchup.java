package Decorator;

public class Ketchup extends AddOn {
	private double price = 0.25;

	public Ketchup(Food food) {
		super(food);
	}

	public double getPrice() {
		return super.getPrice() + getPriceWithKetchup();
	}

	private double getPriceWithKetchup() {
		return price;
	}
}