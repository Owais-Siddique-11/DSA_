/*
 The Number like 371 ->
  3^3 + 7^3 + 1^3 = 371 is called an Armstrong number 
  also number like 1634->
  1^4 + 6^4 + 3^4 + 4^4 = 1634 
  for the number of digits there in number is also there in the power 
 */


public class AmrstrongNumber {
    static void arm(int n){
        int add=0;
        int lastDigit;
        int og= n;
        int numDigits=0;
        while(n>0){
            n=n/10;
            numDigits++;
        }
        n = og;
        while(n>0){
            lastDigit=n%10;
            add += Math.pow(lastDigit, numDigits);
            n=n/10;
        }
        if(og == add){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    } 
    public static void main(String[] args) {
        arm(371);
    }
}
