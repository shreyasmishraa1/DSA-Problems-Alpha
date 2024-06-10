/* To print the following pattern
   *
  ***
 *****
*******
*******
 *****
  ***
   *
*/
import java.util.*;
public class DiamondPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        for ( int i = 1; i <= num; i++)
        {
            // spaces
            for( int j = 1; j <= (num-i); j++)
                System.out.print("  ");
            // stars
            for ( int j = 1; j <= (2*i-1); j++)
                System.out.print("* ");
            System.out.println();
        }
        for ( int i = num; i > 0; i--)
        {
            // spaces
            for( int j = 1; j <= (num-i); j++)
                System.out.print("  ");
            // stars
            for ( int j = 1; j <= (2*i-1); j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
