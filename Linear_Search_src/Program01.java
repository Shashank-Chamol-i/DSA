public class Program01 {
    public static void main(String[] args)
    {
        int [] arr ={12,55,45,78,95,35,4};
        int target = 78;
        System.out.println( search(arr,target));
    }
    static int search(int[]arr,int target)
    {
        for(int a :arr)
        {
            if(a==target)
            {
                return a;
            }
        }
        return -1;
    }

}
