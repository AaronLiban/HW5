package Decorator;

public class AddOn implements Food {
    private Food decoratedFood;
    public AddOn(Food food) {
        this.decoratedFood = food;
    }
    public double getPrice() {
        return decoratedFood.getPrice();
    }
}