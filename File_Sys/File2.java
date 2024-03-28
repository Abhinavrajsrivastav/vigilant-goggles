import java.io.File;

public class File2 {
    public static void main(String[] args) throws Exception {
        File file = new File("Data");
        file.mkdir();
        
        File student = new File(file, "Student.txt");
        student.createNewFile();

        int count = 0;
        String[] list = file.list();

        if (list != null) {
            for (String name : list) {
                count++;
                System.out.println(name);
            }
        } else {
            System.out.println("No files found in directory.");
        }
        System.out.println("Total files: " + count);
    }
}
