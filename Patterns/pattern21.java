/*
 ****
 *  *
 *  *
 ****
 */

public class pattern21 {
    public static void main(String[] args) {
        int n = 4;  // Size of the square pattern

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print stars for the border
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    // Print spaces for the inner cells
                    System.out.print(" ");
                }
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
