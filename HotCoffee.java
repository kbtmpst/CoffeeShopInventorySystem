public class HotCoffee extends CoffeeProduct {
    public HotCoffee(String name, double price, int quantity) throws InvalidValueException {
        super(name, price, quantity);
    }

    @Override
    public String getCategory() {
        return "Hot Coffee";
    }
}
