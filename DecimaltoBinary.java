// To convert a decimal number into binary
import java.util.*;
public class DecimaltoBinary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int num = sc.nextInt();
        int bin = 0;
        int powr = 0;
        while(num > 0)
        {
            int rem = num%2;
            bin = bin + rem * (int)Math.pow(10,powr);
            num = num/2;
            powr++;
        }
        System.out.println(bin);
    }
}
