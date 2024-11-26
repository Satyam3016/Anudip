import java.util.*;
public class InsertionSort {
    // Insertion Sort Method
    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elements of arr[0..i-1] that are greater than the key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Method to take input from the user
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Taking array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Taking user input for the array
        int[] arr = takeInput();
        
        // Display the original array
        System.out.println("Original Array: ");
        printArray(arr);
        
        // Perform Insertion Sort
        int[] arrSorted = arr.clone(); // The original array to preserve it
        InsertionSort(arrSorted);
        System.out.println("Array after Insertion Sort: ");
        printArray(arrSorted);
    }
}
//Output
//Enter the number of elements in the array: 5
//Enter the elements of the array:
//18 17 16 27 28
//Original Array: 
//18 17 16 27 28 
//Array after Insertion Sort: 
//16 17 18 27 28 