package Threading.Applet;
import java.util.Random;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class AnimalFactory {
    public static Animal createRandomAnimal() {
        Random random = new Random();
        int randomNumber = random.nextInt(2); // Generate a random number (0 or 1)
        if (randomNumber == 0) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.createRandomAnimal();
        animal.makeSound();
    }
}
