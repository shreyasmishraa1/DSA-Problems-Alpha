//To store the reverse of a number and then print
import java.util.*;
public class reverseofnum2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int rev=0;
        while(num>0)
        {
            int rem=num%10;
            num=num/10;
            rev = (rev*10) + rem;
        }
        System.out.println(rev);
    }
}
