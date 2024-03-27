
class Student<T>{
    private T s;

    public Student(T s){
        this.s = s;
    }

    public T getValue(){
        return s;
    }
}

class Genrie{
    public static void main(String[] args) {
        Student<String> s1 = new Student<>("Ram");
        Student<Integer> s2 = new Student<>(15);

        System.out.println("Name of student is "+s1.getValue());
        System.out.println("Age of student is "+s2.getValue());
    }
}
