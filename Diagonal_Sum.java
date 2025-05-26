import java.util.*;
public class Diagonal_Sum
{
    public static void Dgsum(int matrix[][])
    {
        int sum  = 0;
        // Brute Force method
        // Time complexity: O(n^2)
       /* for(int i = 0; i <= matrix.length-1; i++)
        {
            for(int j = 0; j <= matrix[0].length-1; j++)
            {
                if(i==j)
                    sum += matrix[i][j];
                else if ( i + j == matrix.length - 1)
                    sum += matrix[i][j];
            }
        } */

        //Optimised code
        // Time complexity: O(n)
        for(int i = 0; i < matrix.length; i++)
        {
            sum += matrix[i][i];
            if(i != matrix.length-1-i)
                sum += matrix[i][matrix.length-1-i];
        }

        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Dgsum(matrix);
    }
}
