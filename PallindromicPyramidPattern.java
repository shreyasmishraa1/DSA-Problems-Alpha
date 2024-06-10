/* To print the following pattern
    1
   212
  32123
 4321234
543212345
*/
import javax.swing.*;
import java.util.*;
public class PallindromicPyramidPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern: ");
        int num = sc.nextInt();
        for ( int i = 1; i <= num; i++)
        {
            int c = i, count = 2;
            // spaces
            for ( int j = 1; j <= (num - i); j++)
                System.out.print(" ");
            // number 1
            for ( int j = 1; j <= i; j++)
            {
                if( c>0 )
                {
                    System.out.print(c);
                    c--;
                }
            }
            // number 2
            for ( int j = 1; j < i; j++)
            {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
