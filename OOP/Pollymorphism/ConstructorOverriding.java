
class Student{
    String name;
    int age;

    //Contructor 
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("this is parent class constructor");
    }

}


// This will give error because we can't override constructor in java
// public class ConstructorOverriding extends Student {
//     public static void main(String[] args) {
        
//     }
// }
