package Sorting;
/*
 In Selection Sort we choose the smallest number in array and swap it to the first position
 eg)[13,46,24,52,20,9] step 1: the smallest number is 9 so swapping it with 13
    [9,46,24,52,20,13] step 2:now avoiding 9 the smallest number is 13 swap(13,46)
    [9,13,24,52,20,46] step 3: now avoiding 9,13 the smallest number is 120 swap(20,24)
    [9,13,20,52,24,46] step 4: now avoiding 9,13,20 the smallest number is 120 swap(24,52)
    [9,13,20,24,52,46] step 5: now avoiding 9,13,20,24 the smallest number is 120 swap(46,52)
    FINAL ANSWER IS -:[9,13,20,24,46,52] 
 */

 //Time Complexity is O(n^2)
import java.util.Scanner;
public class SelectionSort {
    static void selection_sort(int arr[],int n){
        for(int i=0;i<=n-1;i++){
            int mini=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[mini]){ 
                    mini =j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
            
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
        selection_sort(arr, n);

    }
}
