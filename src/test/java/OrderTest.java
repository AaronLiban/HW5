import Decorator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    Order order = new Order();

    @Test
    public void testBurger() {
        double expected = 2.50;
        Food burger = new Burger();
        order.addOrder(burger);
        double actual = order.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testFries() {
        double expected = 1;
        Food fries = new Fries();
        order.addOrder(fries);
        double actual = order.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testHotdog() {
        double expected = 1.50;
        Food hotdog = new Hotdog();
        order.addOrder(hotdog);
        double actual = order.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testKetchup() {
        double expected = 1.25;
        Food fries = new Fries();
        fries = new Ketchup(fries);
        order.addOrder(fries);
        double actual = order.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testDrink() {
        double expected = 2;
        Food fries = new Fries();
        fries = new Drink(fries);
        order.addOrder(fries);
        double actual = order.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testLoyalty() {
        double expected = 0.90;
        Food fries = new Fries();
        order.addOrder(fries);
        order.setLoyalty(true);
        double actual = order.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testOrderList() {
        double expected = 5;
        Food meal1 = new Burger();
        order.addOrder(meal1);

        Food meal2 = new Fries();
        order.addOrder(meal2);

        Food meal3 = new Hotdog();
        order.addOrder(meal3);
        double actual = order.getPrice();
        assertEquals(expected, actual);
    }
}
