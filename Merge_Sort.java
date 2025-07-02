import java.util.*;
public class Merge_Sort
{
    // merge sort function
    public static void mergeSort(int arr[], int si, int ei)
    {
        if(si >= ei) // base case
            return;
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }

    // merge function
    public static void merge(int arr[], int si, int mid, int ei)
    {
        int temp[] = new int[ei-si+1];
        int i = si; // left iterator
        int j = mid+1; // right iterator
        int k = 0; // temp iterator
        while (i <= mid && j <= ei)
        {
            if(arr[i] < arr[j])
                temp[k] = arr[i++];
            else
                temp[k] = arr[j++];
            k++;
        }

        // left elements

        while(i <= mid)
            temp[k++] = arr[i++];

        // right elements

        while(j <= ei)
            temp[k++] = arr[j++];

        // copy temp to original array

        for(k = 0, i = si; k < temp.length; k++,i++)
        {
            arr[i] = temp[k];
        }
    }

    public static void display(int[] Arr)
        {
            for(int i = 0; i < Arr.length; i++)
            {
                System.out.print(Arr[i] + " ");
            }
            System.out.println();
        }
    public static void main(String[] args)
    {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr,0, arr.length-1);
        display(arr);
    }
}
