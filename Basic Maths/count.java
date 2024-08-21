public class count{
    static int cnt(int n){
        int cn=0;
        while(n>0){ // checking that n is more than 0 or not
        cn=cn+1; // a variable for counting number of Digits 
        n=n/10; // removing last digit of the number 
        }
        return cn;  // returning the counting variable
    }
    public static void main(String[] args) {
        int a =cnt(123);
        System.out.println(a);
    }
}