class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy using Object's clone method
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // default shallow copy
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address1 = new Address("New York");
        Person person1 = new Person("John", address1);

        // Shallow copy of person1
        Person person2 = (Person) person1.clone();

        // Changing address of person2
        person2.address.city = "Los Angeles";

        System.out.println("Person 1 address: " + person1.address.city); // Los Angeles
        System.out.println("Person 2 address: " + person2.address.city); // Los Angeles
    }
}
