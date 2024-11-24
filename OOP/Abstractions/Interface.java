// Interface for Academic Activities
interface Academic {
    void study();
    void takeExam();
}

// Interface for Sports Activities
interface Sports {
    void playSport();
    void participateInTournament();
}

// Class implementing both interfaces
class Student implements Academic, Sports {
    @Override
    public void study() {
        System.out.println("Student is studying.");
    }

    @Override
    public void takeExam() {
        System.out.println("Student is taking an exam.");
    }

    @Override
    public void playSport() {
        System.out.println("Student is playing a sport.");
    }

    @Override
    public void participateInTournament() {
        System.out.println("Student is participating in a tournament.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.study();
        student.takeExam();
        student.playSport();
        student.participateInTournament();
    }
}
