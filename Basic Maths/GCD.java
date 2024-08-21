public class GCD {
    static void gcd(int n1, int n2){
        for(int i=1; i<=n1;i++){
           
                if(n1%i==0 && n2%i==0){
                    System.out.println(i);
                }    
        }
    }
    public static void main(String[] args) {
        gcd(18,12);
    }
}
