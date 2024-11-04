public class Program04 {
    public static void main(String[] args)
    {
        int[]arr = {12 ,56, 154, 7894,324,6,45896};
        System.out.println(countdigit(arr));
    }
    static int countdigit(int[]arr)
    {
    int count = 0;
        for(int a:arr)
        {
            if(even(a))
            {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num)
    {
        int count = 0;
        while(num>0)
        {
            count++;
            num = num/10;
        }
        return count%2==0;
    }

}
