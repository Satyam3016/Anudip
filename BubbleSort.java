import java.util.*;
public class BubbleSort {
    // Bubble Sort Method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Traverse the array from 0 to n-i-1
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap if the element is greater than the next element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        
        // Perform Standard Bubble Sort
        int[] arrBubbleSorted = arr.clone(); // The original array to preserve it
        bubbleSort(arrBubbleSorted);
        System.out.println("Array after Bubble Sort: ");
        printArray(arrBubbleSorted);
        
    }
}
 // Output
//Enter the number of elements in the array: 5
//Enter the elements of the array:
//78 89 87 67 56
//Original Array: 
//78 89 87 67 56 
//Array after Bubble Sort: 
//56 67 78 87 89 