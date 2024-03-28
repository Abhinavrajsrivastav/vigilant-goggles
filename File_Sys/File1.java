
import java.io.*;

class File1{
    public static void main(String[] args) throws IOException{
        File file = new File("Student.txt");
        //if file doesn't exist, create it or if file exit file refference will point to the file

        //Before creating filr...
        System.out.println(file.exists());

        //Creating file
        file.createNewFile();
        System.out.println(file.exists());

        //to create directry..
        // File dir = new File("Student");
        // dir.mkdir();
    }
}