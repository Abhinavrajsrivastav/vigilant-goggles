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

        File directory = new File("Data");
        directory.mkdir(); 

        File file = new File(directory, "Arun.ser");
        try {
            file.createNewFile(); 

            FileOutputStream fos = new FileOutputStream(file);

            //this serializes the object
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(arun);
            oos.close();
            fos.close();

            System.out.println("Arun object has been serialized and saved to " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
