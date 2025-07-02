//Calculate the sum of all the elements in the given array

public class sumOfNum {
    public static void main(String[] args) {
        int a[]={1,3,5},sum=0;
        for(int i=0;i<a.length;i++){
            sum = sum+ a[i];
        }
        System.out.println("Sum is :"+sum);
}
}
