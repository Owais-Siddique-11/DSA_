//To find the last occurence of a number x in an array 
import java.util.Scanner;
public class LastOccurrence {
    public static void main(String[] args) {
        int a[]={1,3,4,3,4,5,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element : ");
        int n=sc.nextInt();
        int mark=0;
        for(int i=0;i<a.length;i++){
            if(n==a[i]){
                mark=i;
            }
        }
        System.out.print("The last occurrence of element "+n+" is :"+mark);
    }
}
