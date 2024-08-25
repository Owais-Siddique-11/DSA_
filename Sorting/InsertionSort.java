package Sorting;
/*
 Suppose we want to sort the array [5, 2, 9, 1, 5, 6] using insertion sort:

Start with the second element (2), compare it with 5, and since 2 < 5, swap them. Array becomes: [2, 5, 9, 1, 5, 6].
Move to the next element (9). It's already greater than the previous ones, so no change: [2, 5, 9, 1, 5, 6].
Move to the next element (1). Compare with 9, 5, and 2, and insert it at the start: [1, 2, 5, 9, 5, 6].
Move to the next element (5). Compare and insert it before 9: [1, 2, 5, 5, 9, 6].
Finally, move to the last element (6). Compare and insert it before 9: [1, 2, 5, 5, 6, 9].
 */
//Best Time Complexity is O(n)
//Worst and average is O(n^2)

import java.util.Scanner;

public class InsertionSort {
    static void sort(int arr[], int n) {
        for (int i = 1; i < n; i++) { // Start from 1 as the first element is already sorted
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--; // Decrement j to compare with previous elements
            }
        }
        
        for(int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println(); // Optional: Add a new line after printing the sorted array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        sort(arr, n);
    }
}
