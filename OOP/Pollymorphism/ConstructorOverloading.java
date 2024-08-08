//Allowed In java


class ConstructorOverloading{
      public static void main(String[] args) {
            // Creating object of class
            Student student1 = new Student();
            Student student2 = new Student("John");
            Student student3 = new Student("John", 20);
            Student student4 = new Student("John", 20);
      }
}

class Student{
      String name;
      int age;

      // Default constructor
      Student(){
            System.out.println("Default constructor");
      }

      // Constructor with one parameter
      Student(String name){
            this.name = name;
            System.out.println("Constructor with one parameter");
      }

      // Constructor with two parameters
      Student(String name, int age){
            this.name = name;
            this.age = age;
            System.out.println("Constructor with two parameters");
      }
}