import java.util.*;
public class Staircase_Search
{
    public static boolean search(int matrix[][], int key)
    {
        int row = 0, col = matrix[0].length-1;
        while(row <= matrix.length-1 && col <= matrix[0].length)
        {
            if(matrix[row][col] == key)
            {
                System.out.println( key + " found at: " + "(" + (row) + "," + (col) + ")" );
                return true;
            }
            else if(key > matrix[row][col])
                row ++;
            else
                col--;
        }
        System.out.println( key + "not found");
        return false;
    }
    public static void main(String[] args)
    {
        int matrix[][] = {{10,20,30,40}, {15,25,35,45}, {27,29,37,48},{32,33,39,50}};
        int key = 33;
        search(matrix,key);
    }
}

