/*
  Prints all Divisors of a number 
 */

public class Divisors {
    static void div(int n){
        for(int i=1 ; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
     div(36);   
    }
}
