package Sorting;


public class InsertionSort {
    public static void insertionsort(int []arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
          for( int j=i;j>0;j--){
            if(arr[j]<arr[j-1]){
                swap(arr,j,j-1);
            }
            else break;
          }
        }


    }
    public static void swap(int[] arr, int c, int d) {
        int temp = arr[c];
        arr[c] = arr[d];
        arr[d] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {22, 1, 3, 5, 7, 33, 66, 8,0};
        insertionsort(arr);
        
        // Print the sorted array
        for (int a : arr) {
            System.out.print(a + " ");
        }
        
    
    
}
}
