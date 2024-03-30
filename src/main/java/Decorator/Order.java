package Decorator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Food> orders = new ArrayList<Food>();
	private boolean loyalty = false;

	public Order() {

	}

	public Order(Order order) {

	}

	public void addOrder(Food food) {
		this.orders.add(food);
	}

	public List<Food> getOrders() {
		return orders;
	}

	public void setLoyalty(boolean loyalty) {
		this.loyalty = loyalty;
	}

	public boolean getLoyalty() {
		return loyalty;
	}

	public double getPrice() {
		double total = 0;
		for (Food order : this.orders) {
			total += order.getPrice();
		}

		if (this.loyalty)
			total = Loyalty.addDiscount(total);
		BigDecimal bd = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
		double roundTotal = bd.doubleValue();
		return roundTotal;
	}
}