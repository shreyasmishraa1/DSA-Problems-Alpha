/*
A
B C
D E F
G H I J
Key point is that u could have used char ch = 'A' and then do ch++ within the loop
 */
import java.util.*;
public class CharacterPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n = sc.nextInt();
        int ch = 65; //char ch = 'A';
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print((char)ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
