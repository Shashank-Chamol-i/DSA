public class Program03 {
    public static void main(String[] args)
    {
        int[][]arr ={
                {1 , 25 , 98},
                {88 , 56 ,32},
                {11 ,22 ,33}
        };
        int target = 11;
        System.out.println(search(arr,target));
    }
    static int search(int[][]arr,int target)
    {
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    return arr[i][j];
                }
            }
        }
        return -1;
    }
}
