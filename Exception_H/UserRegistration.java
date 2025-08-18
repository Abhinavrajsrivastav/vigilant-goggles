package Exception_H;
import Exception_H.InvalidAgeException;

public class UserRegistration {
    
    public void registerUser(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throwing the custom checked exception
            throw new InvalidAgeException("User must be at least 18 years old to register.");
        }
        System.out.println("User registered successfully!");
    }

    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        
        try {
            registration.registerUser(16);
        } catch (InvalidAgeException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }
}