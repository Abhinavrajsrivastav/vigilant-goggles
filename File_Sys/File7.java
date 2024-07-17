
import java.io.*;

public class File7 {
    public static void main(String[] args) throws IOException{
        //PrintWriter
        File file = new File("Data");
        File student = new File(file, "Student.txt");

        //printwriter is used to write formatted text to a file
        try(PrintWriter pw = new PrintWriter(new FileWriter(student))){
            pw.println("This is Abhinav");
            pw.println("This is a new line");
            pw.println("This is another new linee");
        }

    }
}
