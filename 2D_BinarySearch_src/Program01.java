import java.util.Arrays;

public class Program01 {
    public static void main(String[] args){
        int[][] mat = {
            {1 , 2 , 3, 4},
            {11 , 15 , 20 , 25 },
            {40 , 45 , 50 , 55}
        };
    System.out.println(Arrays.toString(search(mat,45)));
    }
    static int[]search(int[][] mat,int target){
        int r = 0;
        int c = mat.length - 1;
        while(r<mat.length && c>=0)
        {
            if(mat[r][c]==target)
            {
                return new int[] {r,c};
            }
            if(mat[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}

