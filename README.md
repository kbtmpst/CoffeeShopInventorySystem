# ☕ Coffee Shop Inventory Management System

**IT-2108 — Final Project**
**Members:** Bongolto, Delmar · Cipres, Justine Harvey C. · Papong, Jan Lui L. · Ramos, Jhun Carlo B.

A simple Java console application designed to manage coffee shop inventory while demonstrating key Object-Oriented Programming (OOP) concepts.

---

## 📌 Project Overview

This program allows users to:

- Add coffee items
- Update stock
- View inventory
- Delete items
- Generate an inventory receipt

It showcases essential OOP principles through a practical and easy-to-use inventory management system.

---

## 🧠 OOP Concepts Applied

- **Abstraction** – `CoffeeProduct` serves as an abstract base class.
- **Inheritance** – `HotCoffee`, `IcedCoffee`, and `CoffeeBeans` extend `CoffeeProduct`.
- **Polymorphism** – Each subclass overrides `getCategory()`.
- **Encapsulation** – Private fields managed via getters, setters, and validation.
- **Exception Handling** – Custom `InvalidValueException` for handling invalid input.

---

## 🏗 Program Structure

- **Main** – Program flow and menu system
- **CoffeeProduct** – Abstract base class for all coffee products
- **HotCoffee / IcedCoffee / CoffeeBeans** – Subclasses representing product types
- **Inventory** – Stores, updates, deletes, and displays product data
- **InventoryReceipt** – Creates and prints formatted receipts
- **InvalidValueException** – Handles invalid values safely

---

## 📁 Project Directory Structure

```
CoffeeShopInventorySystem/
├── .vscode/
├── src/
│   ├── CoffeeBeans.java
│   ├── CoffeeProduct.java
│   ├── HotCoffee.java
│   ├── IcedCoffee.java
│   ├── InvalidValueException.java
│   ├── Inventory.java
│   ├── InventoryReceipt.java
│   └── Main.java
└── README.md
```

---

## ▶️ How to Run

### **Compile all Java files:**

```
javac *.java
```

### **Run the program:**

```
java Main
```

---

## 🖥 Sample Output

```
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
```

---

## 🙏 Acknowledgements

We would like to express our gratitude to the following:

- Our Instructor for continuous guidance throughout the project
- Java Documentation and Tutorials for providing essential references
- Online Programming Communities for helping solve coding challenges
- Team Members for collaboration, ideas, and contributions:

  - Bongolto, Delmar
  - Cipres, Justine Harvey C.
  - Papong, Jan Lui L.
  - Ramos, Jhun Carlo B.

This project is the result of collective effort, learning, and teamwork.

---

## ⚠️ Disclaimer

This system was developed strictly for educational purposes as part of the IT-2108 course. It is a basic console‑based inventory management tool and is **not intended for real-world commercial use**. The authors are not liable for any issues arising from modifying or applying the system in an actual business environment.

Users are encouraged to improve, customize, and test the program responsibly.

---

## 🌟 Thank You!

Thank you for viewing and using our Coffee Shop Inventory Management System. We hope this helps you understand core OOP concepts more clearly!
