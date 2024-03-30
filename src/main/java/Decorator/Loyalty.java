package Decorator;

public class Loyalty extends Order {
	
	public static double addDiscount(double price) {
		return price * 0.90;
	}

}