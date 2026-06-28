## What is OOP?

Object Oriented Programming - Using classes or objects to generalise the code and increase the usability and readability of code.

## Difference between Procedural and OOP Language

**Procedural Languages:** C, Pascal execute in an order and the data is exposed, cannot be reused much.

**OOP Languages:** Python, Java, C++ simplify the coding experience in writing and understanding through:
1. **Modular** - Segregate the code into smaller understandable pieces
2. **Reusability** - These smaller pieces of code are reused throughout the application
3. **Scalability** - Can be easily scaled into complex applications through classes and objects
4. **Security** - Can hide the core business logic

## Class and Object

**Class** - A blueprint or template for creating objects. It has attributes (properties) and methods (functions).

**Object** - An instance of a class, memory is allocated for objects and not for classes.

### Attributes and Methods
- **Attributes** - These define the state of the object at any moment in time - Also called as Instance Variables
- **Methods** - These define the functionality that the object could behave as

### Example
```java
Employee em = new Employee();
```
- `Employee` is a class
- `em` is an object (reference to the heap object Employee created)

### Deletion of an Object
Java uses Garbage Collector which cleans up the object when no reference to it remains.

```java
em = null;  // GC will clean this object
```

## Stack and Heap Memory

### Stack
- Primitive variables and object references are stored in stack
- Stack memory is cleared when methods finish execution

### Heap
- All objects created using `new` are stored in the heap
- Heap memory is managed by the Garbage Collector



Constructors - should not have a return type
System.out.printf("Something : %.2f\n", balance); for printing decimals

Constructor
    A special member function that is called automatically when an object is created.
    Same as class name, if not created, uses default constructor - it does not initializes most of the attributes