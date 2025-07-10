# Java 2D Drawing Application

This Java project is an interactive **2D drawing tool** that uses **Swing** and **Java2D** to let users draw shapes like lines, rectangles, and ovals.  

It's designed to showcase advanced **object-oriented programming (OOP)** principles alongside a real GUI application.

---

## Features

- Java Swing GUI with a custom `JFrame`  
- Supports drawing multiple shapes  
- Filled and unfilled options for shapes  
- Clean separation of shape logic using inheritance and polymorphism  
- Demonstrates Java2D rendering with `Graphics2D`

---

## OOP Concepts Demonstrated

**Abstraction**  
- `MyShapes` is an abstract base class defining common properties and requiring a `draw()` implementation.

**Inheritance**  
- `MyLine`, `MyOval`, `MyRectangle` extend `MyShapes` to provide specific drawing behavior.
- `MyBoundedShapes` adds fillable property reused by bounded shapes.

**Polymorphism**  
- Shapes are drawn through the common `draw()` method interface.
- Allows treating all shapes uniformly while supporting different behaviors.

**Encapsulation**  
- Private fields with controlled getters/setters for shape properties.

**Clean, Modular Design**  
- Separation between GUI frame and shape logic.
- Reusable, extensible classes.

---

## Project File Structure
src/
└── java2ddrawingapplication/<br />
    ├── DrawingApplicationFrame.java<br />
    ├── Java2dDrawingApplication.java<br />
    ├── MyBoundedShapes.java<br />
    ├── MyLine.java<br />
    ├── MyOval.java<br />
    ├── MyRectangle.java<br />
    └── MyShapes.java<br />

- **MyShapes**: Abstract base class for all shapes.
- **MyLine**: Represents straight lines.
- **MyOval / MyRectangle**: Support filled/unfilled rendering.
- **MyBoundedShapes**: Shared logic for bounded shapes with fill state.
- **DrawingApplicationFrame**: Main GUI window setup.
- **Java2dDrawingApplication**: Entry point that launches the app.

## Purpose

This project was built to practice advanced Java GUI development and object-oriented design by creating a simple drawing application.

It demonstrates how to:
- Design class hierarchies for real-world modeling.
- Apply abstraction, inheritance, and polymorphism to support different shape types.
- Build an interactive desktop application using Swing and Java2D.
