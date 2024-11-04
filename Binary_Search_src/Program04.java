/*Infinite size of array */
public class Program04 {
    public static void main(String[] args) {
        int[]arr = {3,5,7,9,15,17,19,21,25,27,29,31,53,97,1023};
        System.out.println(ans(arr,97));

    }
    static int ans(int[]arr,int target)
    {
        int start = 0;
        int end = 1;

        while(target>arr[end])
        {
            int newStart = end + 1;
            end  = end + (end -start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[]arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
    }
}
