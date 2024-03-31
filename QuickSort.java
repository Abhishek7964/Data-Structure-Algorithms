import java.util.*;
class QuickSort
{
    public static void main(String[] args)
    {
        int arr[] = {9,-1,78,90,22,0,45,3};
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        quickSort(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
    
    public static int partition(int arr[],int start,int end)
    {
        int pivot = arr[start];
        int count = 0;
        
        //To count the number of elements smaller than pivot element
        for(int i=start+1;i<arr.length;i++)
        {
            if(arr[i]<=pivot)
            {
                count++;
            }
        }
        
        int pivotIndex = start + count;
        
        //To swap the first element with its actual position 
        int temp = arr[start];
        arr[start] = arr[pivotIndex];
        arr[pivotIndex] = temp;
        
        int i = start;
        int j = end;
        
        //Condition to swap the elements
        while(i < pivotIndex && j > pivotIndex)
        {
            while(arr[i] <= pivot)
            {
                i++;
            }
            while(arr[j] > pivot)
            {
                j--;
            }
            if(i < pivotIndex && j > pivotIndex)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return pivotIndex;
    }
    
    public static void quickSort(int arr[],int start,int end)
    {
        //To check base condition
        if(start>=end)
        {
            return;
        }
        
        //To do partition
        int p = partition(arr,start,end);
        
        //To sort left part
        quickSort(arr,start,p-1);
        
        //To sort right part
        quickSort(arr,p+1,end);
    }
}
