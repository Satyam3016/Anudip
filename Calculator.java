import java.util.*;
class Calculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        // For user input
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Perform arithmetic operations
        int p = a + b;  // Addition
        int q = a - b;  // Subtraction
        int r = a * b;  // Multiplication
        double s = (double) a / b;  // Division (cast to double to handle decimal result)
        int t = a % b;  // Remainder

        // Print the results
        System.out.println("Addition: " + p);
        System.out.println("Subtraction: " + q);
        System.out.println("Multiplication: " + r);
        System.out.println("Division: " + s);
        System.out.println("Remainder: " + t);
    }
}
// Output
//Enter the first number: 9
//Enter the second number: 5
//Addition: 14
//Subtraction: 4
//Multiplication: 45
//Division: 1.8
//Remainder: 4
