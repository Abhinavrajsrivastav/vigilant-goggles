import java.io.*;


public class File5 {
    public static void main(String[] args) throws IOException{
        //BufferedWriter
        File file = new File("Data");
        File student = new File(file, "Student.txt");

       try(BufferedWriter bw = new BufferedWriter(new FileWriter(student))){
              bw.write("This is Abhinav");
              bw.newLine();
              bw.write("This is a new line");
              bw.newLine();
              bw.write("This is another new line");
              bw.newLine();
         }

         //bufferwriter is used to write the data in the file, it is different from filewriter as 
         //it is used to write the data in the file in the form of buffer means it will store the data in the 
         //buffer and then write it in the file here term buffer means memory location where data is stored
    }
}


