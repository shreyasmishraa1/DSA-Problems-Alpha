// To print reverse of a number (without storing) using loop
import java.util.*;
public class reverseofnum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        while(num>0)
        {
            int rem = num%10;
            num = num/10;
            System.out.print(rem);
        }
    }
}
