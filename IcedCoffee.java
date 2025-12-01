public class IcedCoffee extends CoffeeProduct {
    public IcedCoffee(String name, double price, int quantity) throws InvalidValueException {
        super(name, price, quantity);
    }

    @Override
    public String getCategory() {
        return "Iced Coffee";
    }
}
