public class InventoryReceipt {

    public void generateReceipt(CoffeeProduct[] items, int count) {

        System.out.println("\n==== INVENTORY RECEIPT ====");

        if (count == 0) {
            System.out.println("No items to display. Inventory is empty.");
            return;
        }

        double total = 0;

        for (int i = 0; i < count; i++) {
            CoffeeProduct p = items[i];

            System.out.println("-----------------------------------");
            System.out.println("Item: " + p.getName());
            System.out.println("Category: " + p.getCategory());
            System.out.println("Quantity: " + p.getQuantity());
            System.out.println("Price: ₱" + p.getPrice());
            System.out.println("Subtotal: ₱" + p.getTotalValue());

            total += p.getTotalValue();
        }

        System.out.println("-----------------------------------");
        System.out.println("TOTAL INVENTORY VALUE: ₱" + total);
        System.out.println("===================================");
    }
}
