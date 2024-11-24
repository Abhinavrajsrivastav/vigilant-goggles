// Class to represent a Student
public class Student {
    // Private fields (data hiding)
    private String name;
    private int age;
    private String studentId;

    // Public getter and setter methods to access private fields

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) { // Ensures age is positive
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    // Getter for studentId
    public String getStudentId() {
        return studentId;
    }

    // Setter for studentId
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}

// Main class to test Encapsulation
public class Main {
    public static void main(String[] args) {
        // Create a new Student object
        Student student = new Student();

        // Set values using setter methods
        student.setName("Abhinav Raj");
        student.setAge(21);
        student.setStudentId("AIML2025");

        // Get and print values using getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());
    }
}
