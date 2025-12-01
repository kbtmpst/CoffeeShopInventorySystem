public class CoffeeBeans extends CoffeeProduct {
    public CoffeeBeans(String name, double price, int quantity) throws InvalidValueException {
        super(name, price, quantity);
    }

    @Override
    public String getCategory() {
        return "Coffee Beans (Packaged)";
    }
}
