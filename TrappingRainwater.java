import java.util.*;
public class TrappingRainwater
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Enter the width");
        int width = sc.nextInt();
        int waterlevel = 0, trappedwater = 0;
        int max_left[] = new int[height.length];
        int max_right[] = new int[height.length];
        max_left[0] = height[0];
        max_right[0] = height[0];

        // Creating Auxillary Arrays
        for ( int i = 0; i < height.length; i ++)
        {
            // max_left
            for ( int j = 0; j <= i; j++)
            {
                if ( height[j] > max_left[i])
                    max_left[i] = height[j];
            }
            // max_right
            for ( int j = i; j < height.length; j++)
            {
                if ( height[j] > max_right[i])
                    max_right[i] = height[j];
            }
        }
        // displaying auxillary arrays
        for ( int i = 0; i < height.length; i++)
        {
            System.out.print(max_left[i] + " ");
        }
        System.out.println();
        for ( int i = 0; i < height.length; i++)
        {
            System.out.print(max_right[i] + " ");
        }
        System.out.println("\n");

        // Calculating trapped water
        for ( int i = 0; i < height.length; i++)
        {
            waterlevel = Math.min(max_left[i], max_right[i]);
            trappedwater += (waterlevel - height[i]) * width;
        }
        System.out.println("Trapped water is: " + trappedwater);
    }
}
