import java.util.*;
public class spiral_matrix
{
    public static void printmatrix(int matrix[][])
    {
        int startrow = 0;
        int endrow = matrix.length-1;
        int startcol = 0;
        int endcol = matrix[0].length-1;

        // Condition
        while(startrow <= endrow && startcol <= endcol) // Equality is important in the case where one element is left at last
        {
            //Top
            for(int j = startcol; j <= endcol; j++)
                System.out.print(matrix[startrow][j] + " ");

            // Right (Yaha pe single element ka checkpoint nhi aayega bcoz i = startrow + 1)
            for(int i = startrow + 1; i <= endrow; i++)
                System.out.print(matrix[i][endcol] + " ");

            //Bottom ( Yaha pe checkpoint aayega)
            for(int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow)
                    break;
                System.out.print(matrix[endrow][j] + " ");
            }

            //Left (Yaha bhi aayega checkpoint)
            for(int i = endrow - 1; i >= startrow + 1; i--) {
                if(startcol == endcol)
                    break;
                System.out.print(matrix[i][startcol] + " ");
            }

            //updation
            startrow++ ;
            endrow--;
            startcol++;
            endcol--;
        }
    }
    public static void main(String[] args)
    {
        int matrix[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        printmatrix(matrix);
    }
}
