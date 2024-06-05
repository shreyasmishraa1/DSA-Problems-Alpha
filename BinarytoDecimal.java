// To convert binary number to decimal
import java.util.*;
public class BinarytoDecimal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int num = sc.nextInt();
        int powr = 0;
        int dec = 0;
        int ld =0;
        while(num>0)
        {
            ld = num%10;
            dec = (int)(dec + ld * Math.pow(2,powr));
            num = num/10;
            powr++;
        }
        System.out.println(dec);
    }
}
