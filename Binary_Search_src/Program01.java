/*Binary Search Program*/
public class Program01 {
    public static void main(String[] args)
    {
        int [] arr ={2,4,6,9,11,13,15,18};
        int target = 11;
        System.out.println(BinarySearch(arr,target));
    }
    static int BinarySearch(int[]arr,int target)
        {
            int start = 0;
            int end = arr.length-1;
            
            while(start<=end)
            {
                int mid = start + (end - start)/2;
                
                if(arr[mid]==target) return mid;
                
                else if(target>arr[mid])
                {
                    start = mid +1;
                }
                else
                {
                    end = mid - 1;
                }
            }
            return -1;
        }
}
