package Inheritance;

public class Upcasting {

    // Process of converting a child class object 
    // reference to a superclass object - Implicit casting

    public static void main(String[] args) {
        Dog d = new Dog();

        Animal a = d; // Upcasting

        a.eat();
        a.walk();
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
