package Decorator;

public class Main {
	public static void main(String[] args) {
		Order order = new Order();
		order.setLoyalty(true);

		Food meal1 = new Burger();
		meal1 = new Ketchup(meal1);
		order.addOrder(meal1);

		Food meal2 = new Fries();
		meal2 = new Drink(meal2);
		order.addOrder(meal2);

		Food meal3 = new Hotdog();
		order.addOrder(meal3);

		System.out.println(order.getPrice());

	}
}
