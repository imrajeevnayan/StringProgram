package Sorting;
public class BubbleSortOptimize {
    public static void BubbleSorT(int[]arr){
      int n=arr.length;
      boolean swapped;

      for(int i=0;i<n-1;i++){
        swapped=false;
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            
            }
        }
    
        if(!swapped) break;
      }
    }
    public static void main(String[] args) {
        int arr[]={11,22,1,2,3,4,5,6,};
        BubbleSorT(arr);
        for(int a:arr) System.out.print(a+" ");
        
    }
    
}
