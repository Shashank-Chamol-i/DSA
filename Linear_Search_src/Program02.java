public class Program02 {
    public static void main(String[] args)
    {
        String name ="Shashank";
        char target = 'k';
        for(char c :name.toCharArray())
        {
            if(target==c)
            {
                System.out.println("Element k present");
                break;
            }
            else{
                System.out.println("Not found ");
            }
        }
        System.out.println("Second CHeck");
        for(int i = 0;i<name.length();i++)
        {
            if(target==name.charAt(i))
            {
                System.out.println("Element found:");
            }
            else
            {
                System.out.println("Element not found : ");
            }
        }
    }
}
