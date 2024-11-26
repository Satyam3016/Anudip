import java.util.*;
public class LastBit {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // for user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Find the last bit
        int lastBit = number & 1;
        
        // Print the last bit
        System.out.println("The last bit of the number is: " + lastBit);
	}
}

//Output
//Enter a number: 9
//The last bit of the number is: 1