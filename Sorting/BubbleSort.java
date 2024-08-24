package Sorting;
/*
The Bubble sort takes the maximun element to the last position
Q)[13,46,24,52,20,9]
Compares the first two value and if needed than swap
[13,46,24,52,20,9]  No swapping cause 13<46 now comparing 46 and 24
[13,24,46,52,20,9]  swapped cause 46>24 now comparing 46 with 52 
[13,24,46,52,20,9] No swapping cause 46<52 now comparing 52 with 20
[13,24,46,20,52,9]  swapped cause 52>20 now comparing 52 with 9
[13,24,46,20,9,52]  swapped cause 9<52 now the 52 is biggest value and it is sorted 
 Now doing the same thing to array [13,24,46,20,9] and this will become [13,24,20,9,46]now 46 is 
 sorted now the array will be [13,24,20,9] by repeating the steps the final answer will be 
 [9,13,20,24,46,52]
 step one we take array from 0 to n-1
 step two we take array from 0 to n-2
 and so on
 */

 // Time complexity is O(N^2)
 //Best case O(N)
import java.util.Scanner;

public class BubbleSort {
    static void bubble(int arr[], int n){
        for(int i=n-1 ; i>=0 ; i--){
            for(int j=0 ; j<=i-1 ; j++){
                 if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                 }
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }      
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of elemets in array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+i+" :");
            arr[i]=sc.nextInt();
        }
        bubble(arr, n);

        
    }
}
