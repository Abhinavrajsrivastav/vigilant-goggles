import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingExample {

    // The 'throws' keyword indicates that this method might throw an exception.
    public void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = null;
        
        // The 'try' block encloses the code that might throw an exception.
        try {
            scanner = new Scanner(file);
            
            // Simulating an intentional error with 'throw'
            if (filePath.isEmpty()) {
                throw new IllegalArgumentException("File path cannot be empty.");
            }
            
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        // The 'catch' block handles the exception if it occurs.
        } catch (FileNotFoundException e) {
            // This 'catch' block handles the specific checked exception.
            System.out.println("Error: The file was not found at the specified path.");
            System.out.println("Exception message: " + e.getMessage());
            
        } catch (IllegalArgumentException e) {
            // This 'catch' block handles the unchecked exception thrown above.
            System.out.println("Error: An invalid argument was provided.");
            System.out.println("Exception message: " + e.getMessage());
        
        // The 'finally' block always executes, for cleanup.
        } finally {
            if (scanner != null) {
                scanner.close(); // Cleanup resource
                System.out.println("Scanner resource has been closed.");
            }
        }
    }

    public static void main(String[] args) {
        ExceptionHandlingExample handler = new ExceptionHandlingExample();
        
        System.out.println("--- Attempting to read a valid file ---");
        try {
            handler.readFile("valid_file.txt"); 
            // Assume valid_file.txt exists for this part.
        } catch (FileNotFoundException e) {
            System.out.println("Main method caught an exception: " + e.getMessage());
        }
        
        System.out.println("\n--- Attempting to read a non-existent file ---");
        try {
            handler.readFile("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Main method caught an exception: " + e.getMessage());
        }
        
        System.out.println("\n--- Attempting to read an empty path (triggers 'throw') ---");
        try {
            handler.readFile("");
        } catch (FileNotFoundException e) {
            System.out.println("Main method caught an exception: " + e.getMessage());
        }
    }
}