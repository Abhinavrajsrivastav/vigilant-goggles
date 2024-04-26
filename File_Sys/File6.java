
import java.io.*;

public class File6 {
    //BufferedReader

    public static void main(String[] args) throws IOException{
        File file = new File("Data");
        File student = new File(file, "Student.txt");

        FileReader fr = new FileReader(student);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
    }
}
