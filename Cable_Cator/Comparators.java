import java.util.*;
import java.util.Comparator;

class Student {
    private String name;
    private int age;
    private int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}

class Alpha implements Comparator<Student> {
          public int compare(Student s1, Student s2) {
        if (s1.getAge() > s2.getAge())
            return 1;
        else if (s1.getAge() < s2.getAge())
            return -1;
        else
            return 0;
    }
}




public class Comparators {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("Bob", 20, 88);
        Student s2 = new Student("Alice", 18, 78);
        Student s3 = new Student("Tom", 19, 98);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("Before sort:");
        System.out.println(students);

        // Collections.sort(students);

        System.out.println("After sort:");

        Alpha a = new Alpha();
        Collections.sort(students, a);
        System.out.println(students);

    }
}