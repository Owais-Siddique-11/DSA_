//Calculate the maximum value in an array
public class MaximumValue{
    public static void main(String []args){
        int a[]={1,5,3};
        int max=0;
        for(int i=0;i<a.length;i++){
            if(max<=a[i]){
                max=a[i];
            }
        }
        System.out.println("Maximum value is :"+ max);
    }
}
