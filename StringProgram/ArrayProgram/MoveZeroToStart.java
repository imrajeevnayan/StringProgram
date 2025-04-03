import java.util.Arrays;

public class MoveZeroToStart {
    public static void MoveZeroStart(int []arr){
        int j=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                int temp=arr[i];
                arr [i]=arr[j];
                arr[j]=temp;
                j--;  
            }

        }
    }
    public static void main(String[] args) {
        int[]arr={0,1,2,4,6,8,0,2,4,5,0,9};
        MoveZeroStart(arr);
        //System.out.println(arr.toString());
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr);
            System.out.print(arr[i]+" ");
        }
    }
}
