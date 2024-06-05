
package Enum;


enum Exam{
    PASS, FAIL, PROMOTED, SUPPLEMENTARY;
}
public class Switch {
    public static void main(String[] args) {
        Exam exam = Exam.PASS;

        //In a switch we can pass an enum type of data....

        switch(exam){
            case PASS:
                System.out.println("You have passed the exam");
                break;
            case FAIL:
                System.out.println("You have failed the exam");
                break;
            case PROMOTED:
                System.out.println("You have been promoted");
                break;
            case SUPPLEMENTARY:
                System.out.println("You have to give supplementary exam");
                break;
            default:
                System.out.println("Invalid exam status");
        }
    }
}
