package Decorator;

public class Drink extends AddOn {

	private double price = 1;

	public Drink(Food food) {
		super(food);
	}

	public double getPrice() {
		return super.getPrice() + getPriceWithDrink();
	}

	private double getPriceWithDrink() {
		return price;
	}

}