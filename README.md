☕ Coffee Shop Inventory Management System

IT-2108
Bongolto, Delmar
Cipres, Justine Harvey C.
Papong, Jan Lui L.
Ramos, Jhun Carlo B.

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

📁 Project Structure

CoffeeShopInventorySystem/
├── .vscode/
├── src/
│ ├── CoffeeBeans.java
│ ├── CoffeeProduct.java
│ ├── HotCoffee.java
│ ├── IcedCoffee.java
│ ├── InvalidValueException.java
│ ├── Inventory.java
│ ├── InventoryReceipt.java
│ └── Main.java
└── README.md

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

🙏 Acknowledgements
We would like to express our gratitude to the following:

- Our Instructor for the guidance and support throughout the project.
- Java Documentation and Tutorials for providing valuable references on Object-Oriented Programming concepts.
- Online Programming Communities for insights and solutions that helped us overcome coding challenges.
- Team Members (Bongolto, Delmar; Cipres, Justine Harvey C.; Papong, Jan Lui L.; Ramos, Jhun Carlo B.) for their collaboration, ideas, and effort in completing this project.
  This project would not have been possible without the collective learning and support from all these sources.

⚠️ Disclaimer
This project was developed solely for educational purposes as part of the IT-2108 course. It is a simple console-based inventory management system and may not be suitable for real-world commercial use. The authors are not responsible for any data loss or misuse if the program is adapted or used in an actual business environment. Users are encouraged to test and modify the code responsibly.

🌟 Thank You!
