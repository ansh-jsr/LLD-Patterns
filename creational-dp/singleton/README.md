# Singleton Design Pattern

This directory contains Java implementations of the **Singleton Design Pattern**, which ensures that a class has only one instance and provides a global point of access to that instance.

The pattern is useful when a single shared instance is required to coordinate actions across different parts of an application, ensuring controlled object creation and consistent access.

## Concepts Covered

| Concept | Description | Status |
|---|---|---|
| Eager Initialization | Creates the singleton instance when the class is loaded. | Completed |
| Lazy Initialization | Creates the instance only when it is first requested. | Completed |
| Synchronized Method | Uses synchronization to prevent multiple threads from creating separate instances. | Completed |
| Double-Checked Locking | Reduces synchronization overhead while maintaining thread safety. | Completed |
| Bill Pugh Singleton | Uses a static inner helper class for lazy and thread-safe initialization. | Planned |
| Enum Singleton | Uses Java enums to implement a simple and serialization-safe singleton. | Planned |

## Repository Structure

```text
singleton/
│
├── README.md
│
├── eager-initialization/
├── lazy-initialization/
├── synchronized-singleton/
├── double-checked-locking/
├── bill-pugh-singleton/
└── enum-singleton/
```

## Implementation Approach

Each implementation explores a different approach to achieving the Singleton pattern.

For every approach, the documentation aims to cover:

- Core concept and working mechanism.
- Problem it solves.
- Object creation and instance management.
- Java implementation with practical examples.
- Thread safety considerations.
- Advantages and limitations.
- Appropriate use cases.

## Technology

- **Language:** Java
- **IDE:** IntelliJ IDEA
- **Version Control:** Git and GitHub

---

*This repository is part of my ongoing journey to understand Low-Level Design, object-oriented programming, and software design principles through practical implementation.*