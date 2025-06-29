class LinearSearch{
    public static void main(String[] args) {
        int []arr={1,9,3,7,4,5,10};
        int target = 4;
        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                System.out.println("The target element is at " + i + " index");
                return;
            }
        }
    }
}