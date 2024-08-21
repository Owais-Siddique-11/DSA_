/*
  **********
  ****  ****
  ***    ***
  **      **
  *        *
  **      **
  ***    ***
  ****  ****
  **********
 */

 public class pattern19 {
    public static void main(String[] args) {
        int n = 5;  // Number of rows in half of the pattern

        // Top half of the pattern
        for (int i = 1; i <= n; i++) {
            // Print stars in the first half
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            // Print stars in the second half
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print stars in the first half
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            // Print stars in the second half
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
