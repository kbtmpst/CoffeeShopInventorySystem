☕ Coffee Shop Inventory Management System

A simple Java console application that helps manage coffee shop inventory using Object-Oriented Programming (OOP) concepts.

📌 Project Overview
This program allows users to:

- Add coffee items
- Update stock
- View inventory
- Delete items
- Generate an inventory receipt
  It demonstrates key OOP principles while providing a practical inventory system.

🧠 OOP Concepts Used
Abstraction – CoffeeProduct is an abstract class.
Inheritance – HotCoffee, IcedCoffee, and CoffeeBeans extend CoffeeProduct.
Polymorphism – Each subclass overrides getCategory().
Encapsulation – Private fields with getters/setters and validation.
Exception Handling – Custom InvalidValueException for invalid input.

🏗 Program Structure

- Main – menu and program flow
- CoffeeProduct – abstract base class
- HotCoffee / IcedCoffee / CoffeeBeans – product types
- Inventory – stores, updates, deletes, displays products
- InventoryReceipt – prints formatted receipt
- InvalidValueException – custom error handling

▶️ How to Run
Compile all Java files:
javac \*.java

Run the program:
java Main

🖥 Sample Output
=== CURRENT INVENTORY ===

1. Latte (Hot Coffee)
   Price: ₱120.00
   Qty: 5
   Total: ₱600.00

==== INVENTORY RECEIPT ====
Item: Latte
Category: Hot Coffee
Quantity: 5
Subtotal: ₱600.00
TOTAL INVENTORY VALUE: ₱600.00

✍️ Authors
Jhun Carlo Ramos
