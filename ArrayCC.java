import java.util.*;
public class ArrayCC
{

    // Binary search
    public static int BinarySearch(int num[], int key)
    {
        int mid = 0;
        int start = 0, end = num.length-1;
        while(start <= end)
        {
            mid = (start + end) / 2;
            if ( key == num[mid])
                return mid;
            else if ( key < num[mid])
            {
                end = mid - 1;
            }
            else if ( key > num[mid])
            {
                start = mid + 1;
            }
        }
        return -1; // if key is not found then this will get executed
    }

    // Reversing an Array
    public static void Reverse_Array(int numb[])
    {
        /* Why did I take numb as the array name and not num?
            To show that arrays are called by reference and the variable name doesn't
            matter, as the storage address will be the same for both num and numb. Hence\
            any change in numb will be reflected in num also. To show this, num is printed
            in the main function.
         */

        int a = 0,b = 0;
        int start = 0, end = numb.length-1;
        while ( start < end)
        {
            a = numb[start];
            numb[start] = numb[end];
            numb[end] = a;
            start++;
            end--;
        }

        // Instead of printing the final array here, we can do it in the main function

        /* while ( b < numb.length) {
            System.out.print(numb[b] + " ");
            b++;
        }
        System.out.println();
         */
    }


    // Pairing in Array
    public static void Pairing( int num[])
    {
        for ( int i = 0; i< num.length; i++)
        {
            int key = num[i];
            for ( int j = i+1; j < num.length; j++)
                System.out.print("(" + key + "," + num[j] + ")");
            System.out.println();
        }
    }

    // Printing Sub arrays
    public static void Print_SubArrays(int num[])
    {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for( int i = 0; i< num.length; i++)
        {
            int start = i;
            for ( int j = i; j < num.length; j++)
            {
                sum = 0;
                int end = j;
                for ( int k = start; k <= end; k++)
                {
                    System.out.print(num[k] + " ");
                    sum = sum + num[k]; // Calculating the sum using * Brut Force Method *
                }
                System.out.print("; Sum = " + sum);
                if ( sum > max)
                    max = sum;
                if ( sum < min)  /*DO NOT USE "ELSE IF" because in that case sum = 2 will not be stored in "min".
                                   It will only be stored in "max" jab ki max & min dono me hi start value should be 2 as
                                   it satisfies the condition.
                                   USE DRY RUN for better understanding */
                    min = sum;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Max sum = " + max);
        System.out.println("Min sum = " + min);
    }

    // Prefix Sum     ***** Very IMPORTANT ****
    public static void Prefix_Sum(int num[])
    {
        Scanner sc = new Scanner(System.in);
        int prefix_array[] = new int[num.length];
        // creating prefix array
        prefix_array[0] = num[0];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for ( int i = 1; i < num.length; i++)
        {
            prefix_array[i] =  prefix_array[i-1] + num[i];
        }
        // Calculating sum and dispalying min and max sum
        for ( int i = 0; i < prefix_array.length; i++ )
        {
            int start = i;
            for ( int j = i; j < prefix_array.length; j++)
            {
                int sum = 0;
                int end = j;
                sum = start == 0 ? prefix_array[end] : prefix_array[end] - prefix_array[start - 1];
                if ( max < sum)
                    max = sum;
                if ( min > sum)
                    min = sum;
                System.out.println("; Sum = " + sum);
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("Max sum = " + max);
        System.out.println("Min sum = " + min);
    }

    public static void main(String[] args)
    {
        int num[] = {2,4,6,8,10};
        int key = 18;

        // Calling Binary Search
        //System.out.println(BinarySearch(num,key));

        // Reversing array
        // Reverse_Array(num);

        // Printing the new array after it has been reversed
        //for(int i = 0; i < num.length; i++)
           //System.out.print(num[i] + " ");

        // Pairing array
        //Pairing(num);

        // Sub arrays
        //Print_SubArrays(num);

        // Prefix Sum
        Prefix_Sum(num);
    }
}
