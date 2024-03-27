

import java.util.*;
import java.util.Collections;

class Students implements Comparable<Students>{
     private String name;
    private int age;
    private int score;

    public Students(String name, int age, int score) {
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

    public int compareTo(Students s){
        if (this.age > s.age)
        return 1;
        else 
        return -1;
    }
}





public class Comparables {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        Students s1 = new Students("Bobbi", 20, 88);
        Students s2 = new Students("Alice", 18, 78);
        Students s3 = new Students("Tom", 19, 98);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("Before sorting :");
        System.out.println(students);

        Collections.sort(students);
        System.out.println("After sorting :");
        System.out.println(students);
    }
}
