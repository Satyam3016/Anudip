import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        // Using try-with-resources to handle Scanner resource
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            try {
                validateEmail(email);
                System.out.println("The email is valid.");
            } catch (InvalidEmailException e) {
                System.out.println("Invalid Email: " + e.getMessage());
            }
        }
    }

    public static void validateEmail(String email) throws InvalidEmailException {
        // Check if '@' is present
        if (!email.contains("@")) {
            throw new InvalidEmailException("Email must contain '@'.");
        }

        // Check if '.' is present
        if (!email.contains(".")) {
            throw new InvalidEmailException("Email must contain a '.' character.");
        }

        // Check if '.' is the last character
        if (email.endsWith(".")) {
            throw new InvalidEmailException("Email cannot end with a '.' character.");
        }

        // Check if '@' is the last character
        if (email.endsWith("@")) {
            throw new InvalidEmailException("Email cannot end with '@'.");
        }
    }
}
