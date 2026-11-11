# Behavioral Design Patterns

This directory contains Java implementations of **Behavioral Design Patterns**, which focus on how objects communicate, interact, and distribute responsibilities within a software system.

These patterns help achieve loose coupling, flexibility, and maintainable code by defining clear communication mechanisms between objects.

## Patterns Covered

| Design Pattern | Description | Status |
|---|---|---|
| Strategy | Defines a family of interchangeable algorithms and encapsulates each one independently. | In Progress |
| Observer | Establishes a one-to-many dependency so that changes in one object notify its dependents. | Planned |
| Command | Encapsulates a request as an object, allowing requests to be parameterized and executed independently. | Planned |
| State | Allows an object to change its behavior when its internal state changes. | Planned |
| Template Method | Defines the skeleton of an algorithm while allowing subclasses to customize certain steps. | Planned |
| Iterator | Provides a way to access elements of a collection sequentially without exposing its internal representation. | Planned |
| Chain of Responsibility | Passes a request through a chain of handlers until one handles it. | Planned |

## Repository Structure

```text
behavioral-dp/
│
├── README.md
│
├── strategy/
│   ├── README.md
│   ├── notification-example/
│   └── robot-example/
│
├── observer/
├── command/
├── state/
├── template-method/
├── iterator/
└── chain-of-responsibility/
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