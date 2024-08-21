/*
 1      1
 12    21 
 123  321
 12344321
 */


public class pattern12 {
    public static void main(String[] args) {
        int space= 6;
        for(int i=1; i<=4; i++){
            //number
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            //number
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space -=2;
        }
    }
}
