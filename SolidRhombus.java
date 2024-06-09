/*
    ****
   ****
  ****
 ****
****
*/
import java.util.*;
public class SolidRhombus
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++)
        {
            // spaces
            for(int j = 1; j <= (num - i); j++)
                System.out.print(" ");
            // star
            for ( int j = 1; j <= num; j++)
                System.out.print("*");
            // spaces
            for (int j = 1; j < i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
