import java.util.Arrays;

public class MoveZeroEnd {
    public static void moveZerosToEnd(int[]arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr [i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={0,1,2,4,6,8,0,2,4,5,0,9};
        moveZerosToEnd(arr);
        //System.out.println(arr.toString());
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr);
            System.out.print(arr[i]+" ");
        }
        
    }
}
