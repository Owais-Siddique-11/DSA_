/*
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 */

 public class pattern20 {
    public static void main(String[] args) {
        int spaces = 8;  // Start with 8 spaces between stars

        // Loop for the pattern
        for (int i = 1; i <= 9; i++) {
            int stars = i <= 5 ? i : 10 - i;  // Calculate the number of stars
            
            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print stars again
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Adjust spaces for the next row
            if (i < 5) {
                spaces -= 2;  // Decrease spaces until the middle row
            } else {
                spaces += 2;  // Increase spaces after the middle row
            }

            // Move to the next line
            System.out.println();
        }
    }
}
