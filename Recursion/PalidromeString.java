public class PalidromeString {
    static boolean check(int i, String s){
        int n=s.length();
        if(i>=n/2) return true;
        if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        return check(i+1, s);
    }
    public static void main(String[] args) {
        String s="MADAM";
        System.out.println(check(0,s));
    }
}
