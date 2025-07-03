import java.util.*;
public class QuickSort
{
    public static void quickSort(int arr[], int si, int ei) // When we divide the array into
    // smaller parts, si and ei may have diff values than default (i.e 0 and arr.length-1),
    // hence we pass them as parameters
    {
        // base case
        if(si >= ei)
            return;
        int pi = partition(arr, si, ei); // storing the pivot index
        quickSort(arr,si,pi-1); // left
        quickSort(arr,pi+1,ei); // right
    }

    public static int partition(int arr[], int si, int ei)
    {
        int pivot = arr[ei]; // last element is taken as the pivot
        int i = si - 1; // iterator to make space for the smaller elements (than pivot)
        int j = si; // make sure it is = to si and not zero

        // Placing smaller elements on the left
        while(j < ei)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }

        // Placing the pivot at the centre
        // ***Be careful, made many mistakes in this section (confusion: where to use i,j,pivot,temp)***
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; 
        arr[i] = temp;
        return i; // return the pivot index
    }

    public static void display(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args)
    {
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        display(arr);
    }
}
