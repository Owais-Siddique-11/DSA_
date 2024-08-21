/*
 Reversing Array using recursion 
 */


import java.util.Scanner;
public class ArraySwap{
    static void rev(int i,int arr[], int n){
        if(i>=n/2) return;
        int temp;
        temp = arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        rev(i+1,arr,n);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++){
        System.out.println("Enter arr of index: "+i);
        arr[i]=sc.nextInt();
    }
    rev(0,arr,n);
    System.out.println("Reversed array:");
    for(int i=0;i<n;i++) System.out.print(" "+arr[i]+" ");
    }
}