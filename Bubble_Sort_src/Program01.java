import java.util.Arrays;

public class Program01 {
    public static void main(String[] args) {
        int[]arr= {4,3,5,2,1};
        bubbleSearch(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSearch(int[]arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 1;j<=arr.length - 1;j++){
                if(arr[j]<arr[j-1]) {
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                }
            }
        }
    }
}
