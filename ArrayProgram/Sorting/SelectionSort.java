package Sorting;
public class SelectionSort {
// Swap function to swap two elements in the array
    public static void swap(int[] arr, int c, int d) {
        int temp = arr[c];
        arr[c] = arr[d];
        arr[d] = temp;
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) 
                    index = j;
                }
            swap(arr, i, index);
        }
    }

    public static void main(String[] args) {
        int arr[] = {22, 1, 3, 5, 7, 33, 66, 8};
        selectionSort(arr);
        
        // Print the sorted array
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
