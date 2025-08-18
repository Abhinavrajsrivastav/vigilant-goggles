package Exception_H;

// Step 1: Define the custom exception class.
// Extending 'Exception' makes it a checked exception.
public class InvalidAgeException extends Exception {

    // Step 2: Add constructors that call the superclass constructors.
    public InvalidAgeException(String message) {
        super(message);
    }
    
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

