/*
    A   
   ABA
  ABCBA
 ABCDCBA
 */

 public class pattern17 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {  // Adjusted to 4 rows
            // Print leading spaces
            for (int j = 0; j < 3 - i; j++) {  // Leading spaces decrease as i increases
                System.out.print(" ");
            }

            // Print increasing and decreasing alphabets
            char ch = 'A';
            int bk = i;  // Mid-point for character increment/decrement
            for (int j = 0; j <= 2 * i; j++) {  // Adjusted to handle the full range of characters
                System.out.print(ch);
                if (j < bk) {
                    ch++;
                } else {
                    ch--;
                }
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}
