public class Sort_zero_one_two {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 2, 1, 2, 0, 1};

        int a = 0;
        int b = 0;
        int c = arr.length - 1;

        while (b <= c) {
            if (arr[b] == 0) {
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b++;
            } else if (arr[b] == 1) {
                b++;
            } else {
                int temp = arr[b];
                arr[b] = arr[c];
                arr[c] = temp;
                c--;
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
