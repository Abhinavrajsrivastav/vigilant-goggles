class AddressDeep implements Cloneable {
    String city;

    AddressDeep(String city) {
        this.city = city;
    }

    // Overriding clone to create a deep copy
    protected Object clone() throws CloneNotSupportedException {
        return new AddressDeep(this.city); // Deep copy of address
    }
}

class PersonDeep implements Cloneable {
    String name;
    AddressDeep address;

    PersonDeep(String name, AddressDeep address) {
        this.name = name;
        this.address = address;
    }

    // Overriding clone method to perform deep copy
    protected Object clone() throws CloneNotSupportedException {
        PersonDeep cloned = (PersonDeep) super.clone();
        cloned.address = (AddressDeep) address.clone(); // Deep copy of address
        return cloned;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        AddressDeep address1 = new AddressDeep("New York");
        PersonDeep person1 = new PersonDeep("John", address1);

        // Deep copy of person1
        PersonDeep person2 = (PersonDeep) person1.clone();

        // Changing address of person2
        person2.address.city = "Los Angeles";

        System.out.println("Person 1 address: " + person1.address.city); // New York
        System.out.println("Person 2 address: " + person2.address.city); // Los Angeles
    }
}
