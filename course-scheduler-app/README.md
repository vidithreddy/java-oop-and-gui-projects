# Course Scheduler App

A **Java Swing application** for managing course scheduling with an embedded **Apache Derby database**.  

This desktop project demonstrates clean **object-oriented design** and **full-stack integration**, including GUI, database access, and data modeling.

---

## Features

- Java Swing GUI for managing data  
- Embedded Apache Derby DB for persistent storage  
- Add and list semesters  
- Add and list courses  
- Add and list students  
- Enroll students in courses with schedule entries  
- Encapsulated DAO pattern for database access  
- MVC-like separation of concerns

---

## OOP Concepts Demonstrated

**Encapsulation**  
- Private fields with getters/setters in model classes  
- Controlled database connections  

**Abstraction**  
- DAO classes hide SQL details from GUI  

**Separation of Concerns**  
- `DBConnection` manages DB connectivity  
- `*Entry` classes model data entities  
- `*Queries` classes handle SQL operations  
- `MainFrame` manages the GUI  

**Reusability and Modularity**  
- Clean, reusable DAOs for Students, Courses, Semesters, Schedules  

---

## Project File Structure
src/
└── coursescheduler/<br />
    ├── CourseEntry.java<br />
    ├── CourseQueries.java<br />
    ├── DBConnection.java<br />
    ├── MainFrame.java<br />
    ├── ScheduleEntry.java<br />
    ├── ScheduleQueries.java<br />
    ├── SemesterQueries.java<br />
    ├── StudentEntry.java<br />
    └── StudentQueries.java<br />


- **Entry classes**: Data models for courses, students, schedules.  
- **Queries classes**: Encapsulated database access logic.  
- **DBConnection**: Singleton for managing DB connectivity.  
- **MainFrame**: Swing GUI entry point.

## Purpose

This project was built to practice advanced Java desktop development, database integration, and object-oriented design in a real-world scenario.

It demonstrates how to:
- Build a Swing GUI for data entry and listing
- Use Java JDBC to connect to a relational database
- Encapsulate SQL logic in reusable DAO classes
- Design clean, maintainable Java code