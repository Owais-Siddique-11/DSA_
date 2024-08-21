public class CheckPalidrome {
    static void check(int n){
        int rev =0;
        int og= n;
        while(n>0){
            int lastDigit=n%10;
            rev = rev*10 + lastDigit;
            n=n/10;
        }
        if(og==rev){
            System.out.println("Number is a Palidrome");
        }
        else{
            System.out.println("Number is not a Palidrome");
        }
    }
    public static void main(String[] args) {
        check(121);
    }
}
