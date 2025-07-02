//Count the number of occurences of a particular element x
import java.util.Scanner;
public class OccurenceOfElement{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]={1,2,4,6,3,4,7,4};
        System.out.print("Enter the number you want to find :");
        int n = sc.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++){
            if(n==a[i]){
                count++;
            }
        }
        System.out.println("The total occurence of "+n+" is : "+count);
    }
}