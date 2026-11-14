# Creational Design Patterns

This directory contains Java implementations of **Creational Design Patterns**, which focus on how objects are created within a software system.

These patterns help manage object creation mechanisms, reduce tight coupling between classes, and provide flexibility in how objects are instantiated and configured.

## Patterns Covered

| **Design Pattern** | **Description** | **Status** |
| ------------------- | --------------- | ---------- |
| Singleton | Ensures that a class has only one instance and provides a global access point to it. | Planned |
| Simple Factory | Encapsulates object creation logic in a separate factory class, centralizing the instantiation of objects based on given conditions. | Completed |
| Factory Method | Defines an interface for creating objects while allowing subclasses to decide which class to instantiate. | Completed |
| Abstract Factory | Provides an interface for creating families of related or dependent objects without specifying their concrete classes. | Completed |
| Builder | Separates the construction of a complex object from its representation, allowing the same construction process to create different representations. | Planned |
| Prototype | Creates new objects by copying existing instances rather than creating them from scratch. | Planned |

## Repository Structure

```text
creational-dp/
│
├── README.md
│
├── singleton/
│
├── factory/
│   ├── simple-factory/
│   ├── factory-method/
│   └── abstract-factory/
│
├── builder/
└── prototype/
```

## Implementation Approach

Each design pattern is explored through practical, independent examples.

For every pattern, the documentation aims to cover:

- Core concept and intent.
- Problem it solves.
- Design and class responsibilities.
- UML class diagram.
- Java implementation through real-world examples.
- Advantages and limitations.
- Appropriate use cases.

## Technology

- **Language:** Java
- **IDE:** IntelliJ IDEA
- **Version Control:** Git and GitHub

---

*This repository is part of my ongoing journey to understand Low-Level Design, object-oriented programming, and software design principles through practical implementation.*