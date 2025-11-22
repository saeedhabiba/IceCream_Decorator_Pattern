# 🍦 IceCream Shop – Decorator Pattern (Java)

This project is a simple Java application that demonstrates the **Decorator Design Pattern** using an ice cream ordering system. It was created as part of a Software Design & Architecture lab to show how dynamic object extension can be achieved cleanly through decorators.

---

## 📌 Features

- Choose an **Ice Cream Base**:
  - Vanilla
  - Chocolate
- Add **Toppings as Decorators**:
  - Sprinkles
  - Chocolate Syrup
- Each topping adds:
  - Extra cost
  - Description enhancement
- Demonstrates **composition over inheritance**

---

## 🏗️ Design Pattern Used: Decorator

The **Decorator Pattern** allows behavior to be added to individual objects dynamically without modifying the original class.

### 🔹 Base Interface
- `IceCream`  
  Contains:
  - `getDescription()`
  - `getCost()`

### 🔹 Concrete Components
- `VanillaIceCream`
- `ChocolateIceCream`

### 🔹 Decorators
- `IceCreamDecorator` (abstract decorator)
- `SprinklesDecorator`
- `ChocolateSyrupDecorator`

This makes the code flexible, scalable, and easy to extend with new toppings.

---

## 📂 Project Structure
IceCreamShop/
IceCream.java
VanillaIceCream.java
ChocolateIceCream.java
/decorators
IceCreamDecorator.java
SprinklesDecorator.java
ChocolateSyrupDecorator.java


---

## ▶️ How to Run

1. Open the project in any Java IDE (IntelliJ, NetBeans, VS Code).
2. Compile and run the `Main.java` file.
3. The program will:
   - Ask for base flavor
   - Ask for toppings
   - Show final description + total cost

---

## 📝 Sample Output

Choose base flavor:

Vanilla

Chocolate

1

Add toppings?

Sprinkles

Chocolate Syrup

Finish

1

2

0

Your Ice Cream: Vanilla Ice Cream + Sprinkles + Chocolate Syrup
Total Cost: $3.50

---

## 🎯 Learning Outcomes

- Understand and implement the **Decorator Design Pattern**
- Improve object-oriented design skills
- Differentiate between inheritance and composition
- Build extendable and modular software components

---

## 📜 License

This project is free to use for educational purposes.

---

## 👨‍💻 Author

Developed for **Software Design & Architecture Course – by Umme Habiba**
