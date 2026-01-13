# E-Commerce System – Project Documentation

---

## 1. Project Overview
The **E-Commerce System** is a **console-based Java application** designed to simulate an online shopping platform.  
The system allows users to view products, add items to a shopping cart, update cart quantities, and place orders using a menu-driven interface.

This project is developed as part of the **Week 5 Internship Task** to demonstrate **Advanced Object-Oriented Programming (OOP) concepts** such as inheritance, polymorphism, abstraction, interfaces, and package organization.

---

## 2. Project Objectives
- To understand and implement inheritance and class hierarchies  
- To apply polymorphism using method overriding  
- To design and use abstract classes  
- To organize code using proper Java packages  
- To build a shopping cart and order management system  
- To implement discount calculation based on product type  
- To develop a structured, menu-driven console application  

---

## 3. Technologies Used
- Java (JDK 8 or above)  
- Eclipse / Spring Tool Suite (STS)  
- GitHub  
- GitHub Desktop  
- Scanner class for user input  

---

## 4. System Requirements

### Hardware Requirements
- Minimum 4 GB RAM  
- Any standard desktop or laptop  

### Software Requirements
- Windows Operating System  
- Java JDK 8 or above  
- Eclipse / Spring Tool Suite (STS)  
- GitHub / GitHub Desktop  

---

## 5. Setup and Project Installation Instructions
1. Install Java JDK (8 or above)  
2. Install Eclipse or Spring Tool Suite (STS)  
3. Clone or download the project from GitHub  
4. Open Eclipse → File → Import → Existing Projects into Workspace  
5. Select the project folder and click **Finish**  
6. Navigate to `ECommerceSystem.java`  
7. Right-click → **Run As → Java Application**  
8. Follow the menu instructions displayed in the console  

---

## 6. Class Diagram
The following UML class diagram represents the structure of the E-Commerce System and the relationships between Product, ShoppingCart, Order, and related classes.

![Class Diagram](ClassDiagram.png)

---

## 7. Project Structure

E-Commerce-System/
│
├── src/
│   └── com.ecommerce/
│       ├── products/
│       │   ├── Product.java
│       │   ├── ElectronicsProduct.java
│       │   ├── ClothingProduct.java
│       │   └── BookProduct.java
│       │
│       ├── cart/
│       │   ├── CartItem.java
│       │   └── ShoppingCart.java
│       │
│       ├── orders/
│       │   ├── Order.java
│       │   └── OrderManager.java
│       │
│       └── main/
│           └── ECommerceSystem.java
│
├── docs/
│   ├── Documentation.md
│   └── UMLDiagram.png
│
└── data/
    └── product_data.txt

---

## 8. Code Structure Explanation

### Product.java
An abstract class that defines common attributes such as productId, name, price, description, and stock.  
It declares abstract methods for discount calculation, which are implemented by subclasses.

### ElectronicsProduct.java
Extends the Product class and represents electronic items.  
Implements discount logic specific to electronics and includes attributes like brand and warranty.

### ClothingProduct.java
Extends the Product class and represents clothing items.  
Includes attributes like size, color, and material, with clothing-specific discount logic.

### BookProduct.java
Extends the Product class and represents books.  
Includes author, ISBN, and page count with book-specific discounts.

### CartItem.java
Represents an item inside the shopping cart with product reference and quantity.

### ShoppingCart.java
Handles cart operations such as add product, update quantity, remove product, and calculate total amount.

### Order.java
Represents an order with order ID, date, cart details, and final amount calculation including GST.

### OrderManager.java
Handles order creation, order summary display, and order status management.

### ECommerceSystem.java
Acts as the main class that provides the menu-driven interface and manages user interaction.

---

## 9. User Manual

### Menu Options
1. View Products  
2. Add to Cart  
3. View Cart  
4. Update Cart  
5. Checkout  
6. Exit  

### How to Use
- Enter the menu number to select an option  
- Enter product ID and quantity when prompted  
- Invalid product IDs display appropriate messages  
- Checkout displays order summary with GST calculation  

---

## 10. Data Validation
- Product availability is checked before adding to cart  
- Invalid product IDs are handled gracefully  
- Quantity validation prevents negative or zero values  
- Empty cart checkout is restricted  

---

## 11. Technical Details
- **Inheritance:** Product class extended by Electronics, Clothing, and Book classes  
- **Polymorphism:** Overridden discount calculation methods  
- **Abstraction:** Abstract Product class hides implementation details  
- **Encapsulation:** Private variables with public getters and setters  
- **Static Members:** Order ID generation using static counter  
- **Package Organization:** Logical separation of code  

---

## 12. Explanation of How Technical Requirements Are Met
- Abstract Product class created with common attributes  
- Concrete product classes implemented using inheritance  
- Polymorphism applied using overridden methods  
- Shopping cart implemented with proper data handling  
- Order management implemented with GST calculation  
- Packages organized according to functionality  

---

## 13. Testing Evidence

| Test Case | Input | Expected Output |
|---------|-------|----------------|
| View Products | Menu option 1 | Product list displayed |
| Add to Cart | Valid product ID | Product added successfully |
| Add to Cart | Invalid product ID | Error message displayed |
| Update Cart | Valid quantity | Cart updated |
| Checkout | Cart with items | Order summary generated |

---

## 14. Conclusion
The E-Commerce System successfully fulfills all **Week 5 Internship requirements**.  
It demonstrates strong understanding of **Advanced Object-Oriented Programming concepts**, clean package organization, and real-world system design using Java.

---

## 15. Author
**Akshada Shelke**  
B.Sc. Computer Science  
Internship Project – Week 5  
Advanced OOP Concepts
