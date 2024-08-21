/*
 E
 DE
 CDE
 BCDE
 ABCDE
 */


public class pattern18 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(char j=(char) ('E'- i); j<='E';j++){ //had to covert the datatype explicitly
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
