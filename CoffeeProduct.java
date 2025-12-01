public abstract class CoffeeProduct {
    private String name;
    private double price;
    private int quantity;

    public CoffeeProduct(String name, double price, int quantity) throws InvalidValueException {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    // Abstract method for category
    public abstract String getCategory();

    // ==========================
    // Encapsulation + Validation
    // ==========================

    public String getName() { 
        return name; 
    }

    public void setName(String name) throws InvalidValueException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidValueException("Name cannot be empty.");
        }

        // Auto-capitalize first letter
        name = name.trim();
        name = Character.toUpperCase(name.charAt(0)) + name.substring(1);

        this.name = name;
    }

    public double getPrice() { 
        return price; 
    }

    public void setPrice(double price) throws InvalidValueException {
        if (price < 0) {
            throw new InvalidValueException("Price cannot be negative.");
        }
        this.price = price;
    }

    public int getQuantity() { 
        return quantity; 
    }

    public void setQuantity(int quantity) throws InvalidValueException {
        if (quantity < 0) {
            throw new InvalidValueException("Quantity cannot be negative.");
        }
        if (quantity > 10000) {
            throw new InvalidValueException("Quantity too large. Max allowed is 10,000.");
        }
        this.quantity = quantity;
    }

    // ==========================
    // Price Helpers
    // ==========================

    public double getTotalValue() {
        return price * quantity;
    }

    public String getFormattedPrice() {
        return String.format("₱%.2f", price);
    }

    public String getFormattedTotal() {
        return String.format("₱%.2f", getTotalValue());
    }
}
