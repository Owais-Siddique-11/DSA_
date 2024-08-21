public class PrimeNumber {
    static void check(int n){
        int count=0;
        for(int i =2 ; i<n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>0){
            System.out.println("Not a Prime Number");
        }
        else{
            System.out.println("Is a Prime Number");
        }
    }
    public static void main(String[] args) {
     check(7);   
    }
}
