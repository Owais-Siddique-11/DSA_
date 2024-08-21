public class ReverseNumber {
    static int num(int n){
        int rev=0;
        while(n>0){
        int lastDigit=n%10; //storing the last digit in lastDigit variable
        rev = rev*10 + lastDigit; // adding the LastDigit variale to the rev variable
        n=n/10; // removing the last digit from the orignal number
        }
        return rev; 
    }
    public static void main(String[] args) {
     int a= num(2036);
     System.out.println(a);  

    }
}
