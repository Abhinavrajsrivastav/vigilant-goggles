package Copy;

class Address {
    String city;
    String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // Method to create a deep copy of Address
    public Address deepCopy() {
        return new Address(this.city, this.state);
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Method to create a deep copy of Person
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clonedPerson = (Person) super.clone();
        clonedPerson.address = this.address.deepCopy(); // Creating a deep copy of Address
        return clonedPerson;
    }
}

public class Mains {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York", "NY");
        Person person1 = new Person("John", address);

        // Create a deep copy of person1
        Person person2 = (Person) person1.clone();

        // Modify the address of person2
        person2.address.city = "Los Angeles";

        // Since it's a deep copy, changing person2's address does not affect person1
        System.out.println(person1.address.city); // Output: New York
    }
}
