# Customer Loan Accounts

A **Java-based customer loan management system** demonstrating advanced object-oriented programming design.  

This project models real-world entities such as customers, addresses, and various loan types using **inheritance**, **composition**, **polymorphism**, and **encapsulation**. It provides a clean, modular foundation for representing and managing loan accounts in a console-based simulation.

---

## What It Demonstrates

**Inheritance**  
- Base class: `LoanAccount` with common loan behavior.  
- Specialized subclasses: `CarLoan`, `PrimaryMortgage`, `UnsecuredLoan`.  

**Polymorphism**  
- Subclasses override `toString()` to customize output.  
- Consistent interface for different loan types.  

**Composition**  
- `Customer` class includes an `Address` and a `LoanAccount`.  
- Reflects real-world relationships in code design.  

**Encapsulation**  
- Private fields with controlled access via getters.  
- Clear constructors for safe object creation.  

**Clean, Modular Design**  
- Reusable, extensible classes.  
- Logical separation of concerns for maintainability.

---

## Project File Structure
src/
├── Address.java
├── CarLoan.java
├── Customer.java
├── Customerloanaccounts.java
├── LoanAccount.java
├── PrimaryMortgage.java
└── UnsecuredLoan.java


- **LoanAccount.java**: Base class with loan details and payment calculation.  
- **CarLoan, PrimaryMortgage, UnsecuredLoan**: Subclasses adding specific fields and behavior.  
- **Customer.java**: Represents a customer with address and loan account.  
- **Address.java**: Value object for customer location.  
- **Customerloanaccounts.java**: Main program demonstrating system usage.

---

## Purpose

This project was created to practice advanced Java object-oriented design by modeling a realistic loan management scenario.

It demonstrates how to:

- Build flexible, extensible class hierarchies.
- Apply inheritance and polymorphism to support different loan types.
- Use composition to model natural relationships between customers and their loans.
- Write clean, maintainable Java code that can be extended to more complex systems.
