import java.util.Scanner;
public class Sortzero_one {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1};
        int a = 0;
        int b = arr.length - 1;
        while (a < b) {
            if (arr[a] == 0) {
                a++;
            }
            else if (arr[b] == 1) {
                b--;
            }
            else {
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            }
        }
        System.out.print("Sorted binary array: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
