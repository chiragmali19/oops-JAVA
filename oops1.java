// Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects," which can contain data and methods. Java is an object-oriented language, and its OOP concepts are fundamental to understanding how to develop applications in Java. Let's explore the core OOP concepts in Java with easy examples:

// 1. Class and Object

// - Class: A blueprint for creating objects. It defines a datatype by bundling data and methods that work on the data into one single unit.
// - Object: An instance of a class. It is created from the class and can access its data and methods.

class Dog {
    // Properties (Instance Variables)
    String name;
    String breed;

    // Method (Behavior)
    void bark() {
        System.out.println(name + " is barking");
    }
}

public class oops1 {
    public static void main(String[] args) {
        // Creating an object (instance) of the Dog class
        Dog myDog = new Dog();
        
        // Assigning values to object properties
        myDog.name = "Buddy";
        myDog.breed = "Golden Retriever";
        
        // Calling method on the object
        myDog.bark(); // Output: Buddy is barking
    }
}

