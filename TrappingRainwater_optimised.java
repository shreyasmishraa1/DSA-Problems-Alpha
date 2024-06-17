import java.util.*;
public class TrappingRainwater_optimised
{
    public static int rainwater(int height[], int width)
    {
        int max_left[] = new int[height.length];
        int max_right[] = new int[height.length];
        max_left[0] = height[0];
        int trappedwater = 0, waterlevel = 0;
        // creating max_left
        for ( int i = 1; i < height.length; i++)
        {
            max_left[i] = Math.max(max_left[i-1],height[i]);
        }

        max_right[height.length-1] = height[height.length-1];

        // creating max_right
        for ( int i = (height.length - 2); i >= 0; i--)
        {
            max_right[i] = Math.max(height[i],max_right[i+1]);
        }
        // Calculating trapped water
        for ( int i = 0; i < height.length; i++)
        {
            waterlevel = Math.min(max_left[i],max_right[i]);
            trappedwater += (waterlevel - height[i]) * width;
        }
        return trappedwater;
    }

    public static void main(String[] args)
    {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int width = 1;
        System.out.println("Trapped rainwater is: " + rainwater(height, width) + " units");
    }
}
