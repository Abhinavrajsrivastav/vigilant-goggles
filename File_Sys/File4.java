import java.io.*;

public class File4 {
    public static void main(String[] args) throws IOException{
        File file = new File("Data");
        file.mkdir();
        
        File student = new File(file, "Student.txt");
        student.createNewFile();
        System.out.println((int)file.length());

        //read the file
        FileReader fr = new FileReader(student);
        
        int i = fr.read();
        while(i != -1){
            System.out.print((char)i);
            i = fr.read();
        }
        
    }
}
