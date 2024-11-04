/*Ceiling of a Number*/
public class Program02 {
    public static void main(String[] args)
    {
        int[]arr= {2,3,5,9,11,15,18};
        int target = 10;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[]arr,int target)
    {

        int start = 0;
        int end = arr.length -1;

        if(target>arr[arr.length-1])
        {
            return -1;
        }
        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(arr[mid]==target) return mid;

            else if (target>arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return start;
    }
}
