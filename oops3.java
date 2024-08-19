// 3. Inheritance
// - Inheritance is a mechanism where one class (child or subclass) can
// inherit fields and methods from another class (parent or superclass).
// - It promotes code reusability.

// Example:

// Parent class (Superclass)
class Animal {
    void eat() {
        System.out.println("This animal is eating");
    }
}

// Child class (Subclass)
class Cat extends Animal {
    void meow() {
        System.out.println("The cat is meowing");
    }
}

public class oops3 {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.eat(); // Inherited method from Animal class
        myCat.meow(); // Method of Cat class
    }
}

