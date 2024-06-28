// Base class named Vehicle
class Vehicle {
    // String member variable named name
    String name;

    // Method show() that prints a generic vehicle message
    public void show() {
        System.out.println("An object that helps to move from one place to the other");
    }
}

// Derived class named Car that extends Vehicle
class Car extends Vehicle {
    // String member variable named model
    String model;

    // Override the show() method to print a specific message for Car
    @Override
    public void show() {
        System.out.println("Object that helps to move from one to the other place");
    }

    // Additional method show1() specific to Car
    public void show1() {
        System.out.println("Object that has 4 wheels and helps to move from one to the other");
    }
}

// Main class to demonstrate upcasting and downcasting
class practice {
    public static void main(String[] args) {
        // Upcasting: Create an instance of Car and assign it to a Vehicle reference
        Vehicle r = new Car();
        // Call the show() method on the Vehicle reference (dynamic method dispatch)
        r.show(); // Output: Object that helps to move from one to the other place

        // Downcasting: Cast the Vehicle reference back to Car
        Car t = (Car) r;
        // Call the show() method on the Car instance
        t.show(); // Output: Object that helps to move from one to the other place
        // Call the show1() method on the Car instance
        t.show1(); // Output: Object that has 4 wheels and helps to move from one to the other
    }
}
