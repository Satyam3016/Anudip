import java.util.*;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        // To take input from the user
        Scanner sc = new Scanner(System.in);
        
        // For the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        // Create array of n size
        int[] arr = new int[n];
        
        // Enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Sort the array 
        Arrays.sort(arr);
        
        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//Output
//Enter the number of elements in the array: 5
//Enter the elements of the array:
//23 34 43 14 45
//Sorted array:
//14 23 34 43 45 