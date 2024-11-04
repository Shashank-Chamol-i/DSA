/*Floor of a Number*/
public class Program03 {
    public static void main(String[] args)
    {
        int[] arr = {2,4,5,7,9,11,13,15};
        int target = 8;
        System.out.println(floor(arr,target));
    }
    static int floor(int[]arr,int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid]==target)return mid;

            else if (target>arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return end;
    }
}
