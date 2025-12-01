public class Inventory {
    private CoffeeProduct[] products;
    private int count;

    public Inventory(int size) {
        products = new CoffeeProduct[size];
        count = 0;
    }

    public void addProduct(CoffeeProduct p) {
        products[count++] = p;
    }

    public void updateProductQty(int index, int qty) throws InvalidValueException {
        if (index < 0 || index >= count)
            throw new InvalidValueException("Invalid product index.");
        products[index].setQuantity(qty);
    }

    public void deleteProduct(int index) throws InvalidValueException {
        if (index < 0 || index >= count)
            throw new InvalidValueException("Invalid product index for deletion.");

        // Shift items to the left
        for (int i = index; i < count - 1; i++) {
            products[i] = products[i + 1];
        }

        products[count - 1] = null; // Remove last duplicate element
        count--;
    }

    public void displayProducts() {
        System.out.println("\n=== CURRENT INVENTORY ===");

        if (count == 0) {
            System.out.println("No items in inventory.");
            return;
        }

        for (int i = 0; i < count; i++) {
            CoffeeProduct p = products[i];
            System.out.println(i + 1 + ". " + p.getName() + " (" + p.getCategory() + ")");
            System.out.println("   Price: ₱" + p.getPrice());
            System.out.println("   Qty: " + p.getQuantity());
            System.out.println("   Total: ₱" + p.getTotalValue());
        }
    }

    public CoffeeProduct[] getProducts() { return products; }
    public int getCount() { return count; }
}
