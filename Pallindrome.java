// To check whether a number is pallindrome or not
import java.util.*;
public class Pallindrome
{
    public static boolean pallindrome(int num)
    {
        int pal = 0, powr = 0;
        int numbr2 = num, numbr = num;
        while(numbr>0)
        {
            numbr = numbr/10;
            powr++;
        }
        powr--;
        while (numbr2>0)
        {
            int a = numbr2%10;
            pal = pal + a * (int)Math.pow(10,powr);
            powr--;
            numbr2 = numbr2/10;
        }
        if (pal == num)
            return true;
        else
            return false;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean result = pallindrome(num);
        if (result == true)
            System.out.println("Pallindrome");
        else
            System.out.println("Not a Pallindrome");
    }
}
