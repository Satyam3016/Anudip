import java.util.*;
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // For user input
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        //checking if num1 is greatest
        if (num1 >= num2 && num1 >= num3)
        System.out.println (num1 + " is the greatest");

        //checking if num2 is greatest
        else if (num2 >= num1 && num2 >= num3)
        System.out.println (num2 + " is the greatest");

        //checking if num2 is greatest
        else if (num3 >= num1 && num3 >= num2)
        System.out.println (num3 + " is the greatest");  
    }
}
//Enter the first number: 8
//Enter the second number: 9
//Enter the third number: 5
//9 is the greatest