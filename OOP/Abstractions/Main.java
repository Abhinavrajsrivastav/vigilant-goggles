package OOP.Abstractions;

// Main class to test abstraction
public class Main {
    public static void main(String[] args) {
        // Creating a Car object
        Vehicle car = new Car("Toyota");
        car.showBrand();      
        car.startEngine();    

        System.out.println();

        // Creating a Motorcycle object
        Vehicle motorcycle = new Motorcycle("Harley-Davidson");
        motorcycle.showBrand(); 
        motorcycle.startEngine();
    }
}

// Abstract class
abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Concrete method..
    public void showBrand() {
        System.out.println("Brand: " + brand);
    }

    // Abstract method..
    public abstract void startEngine();
}

// Subclass 1: Car
class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key.");
    }
}

// Subclass 2: Motorcycle
class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a button.");
    }
}
