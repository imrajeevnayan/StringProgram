package Sorting;
public class BubbleSort1 {
    public static void swap(int[]arr,int c,int d){
        int temp = arr[c];
        arr[c] = arr[d];
        arr[d] = temp;
}
    public static void BubbleSort2(int[]arr){
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            boolean swapped=false;
            for(int j=0;j<=i;j++){
                if(arr[j]> arr[j+1]){
                    swap(arr,j,j+1);
                     swapped=true;
                }
            }
            if(!swapped)break;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,33,44,12,45,6,88,9,0};
        BubbleSort2(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
        
    }
}
