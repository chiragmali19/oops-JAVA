// 4. Polymorphism
// - Polymorphism allows objects to be treated as instances of their parent class,
// even though they might be instances of different subclasses. 
// - It supports method overriding and method overloading.

// Method Overloading: Multiple methods with the same name but different parameters.
// Method Overriding: A subclass provides a specific implementation of a method that 
//                    is already defined in its superclass.

// Example:

// Example of Method Overloading
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Example of Method Overriding
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class oops4 {
    public static void main(String[] args) {
        // Method Overloading
        MathOperations math = new MathOperations();
        System.out.println(math.add(5, 3)); // Output: 8
        System.out.println(math.add(5, 3, 2)); // Output: 10

        // Method Overriding
        Animal myDog = new Dog();
        myDog.sound(); // Output: Dog barks (Overridden method in Dog class)
    }
}

