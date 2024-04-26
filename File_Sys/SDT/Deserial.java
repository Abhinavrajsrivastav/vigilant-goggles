package SDT;
import java.io.*;
public class Deserial {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        File directory = new File("Data");
        directory.mkdir(); 

        File file = new File(directory, "Arun.ser");
        file.createNewFile();

        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Arun arun = (Arun)ois.readObject();
        ois.close();
        fis.close();
        System.out.println("Deserialized Person: " + arun);
    }
}
