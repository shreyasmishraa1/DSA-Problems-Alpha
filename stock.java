import java.util.*;
public class stock
{
    public static void main(String[] args)
    {
        int price[] = {7,1,5,3,6,4};
        profit(price);
    }
    public static void profit(int price[])
    {
        int bp = Integer.MAX_VALUE;
        int maxprofit = 0;
        for ( int i = 0; i < price.length; i++)
        {
            int profit = 0;
            if(bp > price[i])
                bp = price[i];
            else {
                profit = price[i] - bp;
               // if (profit > maxprofit)
                //    maxprofit = profit;
                maxprofit = Math.max(maxprofit, profit);
            }
        }
        System.out.println(maxprofit);
    }

}
