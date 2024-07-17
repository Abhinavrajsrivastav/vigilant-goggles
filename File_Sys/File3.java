import java.io.*;

public class File3 {
    public static void main(String[] args) throws IOException {
         File file = new File("Data");
        file.mkdir();
        
        File student = new File(file, "Student.txt");
        student.createNewFile();

        //FileWriter is used to write characters to a file
        FileWriter fw = new FileWriter(student,true);
        fw.write("This is Abhinav");
        fw.write("\n");
        //fw.flush();
        fw.close();
    }
}