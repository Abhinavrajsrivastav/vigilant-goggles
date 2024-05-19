package Inheritance;

public class DownCasting {

    // Process of converting a superclass object reference to a child class 
    //object reference - Explicit casting

    public static void main(String[] args) {
        Animal a = new Dog(); // Animal reference pointing to a Dog object

        
        if (a instanceof Dog) {
            Dog d = (Dog) a; // Safe downcasting
            d.bark();
            d.eat();
        } else {
            System.out.println("The object is not an instance of Dog");
        }
    }
}

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void walk() {
        System.out.println("Animal is walking");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

    void eat() {
        System.out.println("Dog is eating");
    }
}
