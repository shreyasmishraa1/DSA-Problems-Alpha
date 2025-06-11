import java.util.*;
public class Count_Set_Bits_in_a_Number
{
    public static int countSetBits(int num)
    {
        int count = 0;
        int bitmask = 1;
        while(num != 0)
        {
            if((num & bitmask) != 0) // == 1 is not the general trend, hence prefer writing this, however both are correct
                count ++;
            num = num >> 1;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int num = 10;
        System.out.println(countSetBits(num));
    }
}
