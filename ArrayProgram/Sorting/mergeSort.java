package Sorting;
import java.util.Arrays;
public class mergeSort {
    public static void MergeSort(int []arr,int start,int end) {
        if(start <end ){
            int mid=start+(end-start)/2;
            MergeSort(arr, start, mid);
            MergeSort(arr, mid+1, end);
            Merge(arr,start,mid,end);
          
        }
}
public static void Merge(int[]arr,int start,int mid,int end){
    int[] merged = new int[end - start + 1];
    int i = start, j = mid + 1, k = 0;

    while (i <= mid && j <= end) {
        merged[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
    }

    while (i <= mid) merged[k++] = arr[i++];
    while (j <= end) merged[k++] = arr[j++];

    for (i = 0; i < merged.length; i++) {
        arr[start + i] = merged[i];
    }
}
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 3};
    MergeSort(arr, 0, arr.length - 1);
    for (int i : arr) {
        System.out.print(i+"  ");
        
    }
    }    
}
