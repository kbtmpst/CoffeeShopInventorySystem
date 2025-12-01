public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(50); 
        InventoryReceipt receipt = new InventoryReceipt();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int choice = -1;

        while (choice != 6) {
            System.out.println("\n=== COFFEE SHOP INVENTORY SYSTEM ===");
            System.out.println("1. Add Coffee Item");
            System.out.println("2. Update Stock");
            System.out.println("3. View Inventory");
            System.out.println("4. Generate Receipt");
            System.out.println("5. Delete Item");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1: // ADD
                        System.out.print("Enter coffee name: ");
                        String name = sc.nextLine().trim(); // remove whitespace

                        if (name.isEmpty()) {
                            throw new InvalidValueException("Coffee name cannot be empty!");
                        }

                        System.out.print("Enter price: ");
                        double price = Double.parseDouble(sc.nextLine());

                        if (price <= 0) {
                            throw new InvalidValueException("Price must be greater than 0!");
                        }

                        System.out.print("Enter quantity: ");
                        int qty = Integer.parseInt(sc.nextLine());

                        if (qty < 0) {
                            throw new InvalidValueException("Quantity cannot be negative!");
                        }

                        CoffeeProduct product;

                        System.out.println("\nChoose Category:");
                        System.out.println("1. Hot Coffee");
                        System.out.println("2. Iced Coffee");
                        System.out.println("3. Beans (Packaged)");
                        System.out.print("Enter type: ");
                        int type = Integer.parseInt(sc.nextLine());

                        if (type == 1) product = new HotCoffee(name, price, qty);
                        else if (type == 2) product = new IcedCoffee(name, price, qty);
                        else if (type == 3) product = new CoffeeBeans(name, price, qty);
                        else throw new InvalidValueException("Invalid coffee type!");

                        inventory.addProduct(product);
                        System.out.println("✔ Coffee item added!");
                        break;

                    case 2: // UPDATE
                        System.out.print("Enter product number: ");
                        int index = Integer.parseInt(sc.nextLine())-1;

                        System.out.print("Enter new quantity: ");
                        int newQty = Integer.parseInt(sc.nextLine());

                        if (newQty < 0) {
                            throw new InvalidValueException("Quantity cannot be negative!");
                        }

                        inventory.updateProductQty(index, newQty);
                        System.out.println("✔ Stock updated!");
                        break;

                    case 3: // VIEW ONLY
                        inventory.displayProducts();
                        break;

                    case 4: // GENERATE RECEIPT ONLY
                        receipt.generateReceipt(inventory.getProducts(), inventory.getCount());
                        break;

                    case 5: // DELETE ITEM
                        System.out.print("Enter product number to delete: ");
                        int delIdx = Integer.parseInt(sc.nextLine())-1;

                        inventory.deleteProduct(delIdx);
                        System.out.println("✔ Item deleted!");
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("❌ Invalid number input. Please try again.");
            } catch (InvalidValueException ive) {
                System.out.println("❌ ERROR: " + ive.getMessage());
            } catch (Exception e) {
                System.out.println("❌ Something went wrong: " + e.getMessage());
            }
        }

        sc.close();
    }
}
