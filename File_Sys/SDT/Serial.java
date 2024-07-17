package SDT;
import java.io.*;

class Arun implements Serializable {
    public String name;
    public int age;
    public String address;

    public Arun(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}

public class Serial {
    public static void main(String[] args) {
        Arun arun = new Arun("Arun", 21, "Bangalore");

        //creating a directory
        File directory = new File("Data");
        //checking if the directory exists - if not, create it
        directory.mkdir(); 
        
        //creating a file, name it Arun.ser inside the directory Data
        File file = new File(directory, "Arun.ser");
        try {
            //checking if the file exists - if not, create it
            file.createNewFile(); 
            
            //this creates a file output stream to write to the file
            FileOutputStream fos = new FileOutputStream(file);
 
            //this serializes the object
            //ObjectOutputStream is used to write primitive data types and Java objects to an OutputStream
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            //write the object to the file
            oos.writeObject(arun);
            oos.close();
            fos.close();

            System.out.println("Arun object has been serialized and saved to " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
