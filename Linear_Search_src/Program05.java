import java.util.Scanner;

/*Order Agnostic */
public class Program05 {
    public static void main(String[] args)
    {
        int[]arr = {10,9,8,7,6,5,4,3,2,1};
        int target = 8;
        System.out.println(orderAg(arr,target));
    }
    static int orderAg(int[] arr,int target)
    {
        int first = 0;
        int last = arr.length-1;

        boolean isAsc = arr[first]<arr[last];
        while(first<=last)
        {
            int mid = first + (last - first) / 2;

            if (arr[mid] == target)
            {
                return mid;
            }

            if(isAsc)
            {
                if(target>arr[mid])
                {
                    first = mid + 1;
                }
                else if(target<arr[mid])
                {
                    last = mid - 1;
                }
            }
            else
            {
                if(target<arr[mid])
                {
                    first = mid + 1;
                }
                else if(target>arr[mid])
                {
                    last = mid - 1;
                }
            }
        }
        return -1;

    }
}
