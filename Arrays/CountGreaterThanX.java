//Count the number of elements strictly greater than value x
import java.util.Scanner;
public class CountGreaterThanX {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]={1,3,4,3,4,5,3,4,5,6};
        System.out.print("Enter the element :");
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++){
            if(n<a[i]){
                count++;
            }
        }
        System.out.print("Number of Element greater than "+n+" is : "+count);
    }
}
