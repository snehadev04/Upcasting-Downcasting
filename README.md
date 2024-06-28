### Repository Name
`java-upcasting-downcasting`

### README

# Java Upcasting and Downcasting Example

This repository contains a simple Java program that demonstrates the concepts of upcasting and downcasting using a base class `Vehicle` and a derived class `Car`.

## Overview

- **Upcasting**: Assigning a subclass object to a superclass reference.
- **Downcasting**: Casting a superclass reference back to a subclass reference.

## Classes

### Vehicle Class
The `Vehicle` class serves as the base class and includes a method `show()` to print a generic message.

### Car Class
The `Car` class extends `Vehicle` and:
- Overrides the `show()` method to print a message specific to cars.
- Adds an additional method `show1()` to provide more details about cars.

## Main Class

The `practice` class contains the `main` method to demonstrate upcasting and downcasting.


## How to Run

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/java-upcasting-downcasting-example.git
    cd java-upcasting-downcasting-example
    ```

2. **Compile and run the program**:
    ```bash
    javac practice.java
    java practice
    ```


## Explanation of Output

1. The first call to `show()` demonstrates upcasting by calling the `show()` method on a `Vehicle` reference holding a `Car` object.
2. The second call to `show()` and the call to `show1()` demonstrate downcasting, allowing access to methods specific to the `Car` class.


## Contributing

Feel free to submit issues or pull requests if you find any bugs or have suggestions for improvements.
