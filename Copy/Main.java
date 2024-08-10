
package Copy;

class Address {
    String city;
    String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York", "NY");
        Person person1 = new Person("John", address);

        // Create a shallow copy of person1
        Person person2 = (Person) person1.clone();

        // Modify the address of person2
        person2.address.city = "Los Angeles";

        // Since it's a shallow copy, changing person2's address also affects person1
        System.out.println(person1.address.city); // Output: Los Angeles
    }
}
