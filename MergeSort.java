import java.util.*;
class MergeSort
{
    public static void main(String[] args)
    {
        int arr[] = {2,5,1,6,9};
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length-1;
        mergeSort(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void mergeSort(int arr[],int start,int end)
    {
        //To check base condition
        if(start>=end)
        {
            return;
        }
        
        //To calculate mid
        int mid = (start+end)/2;
        
        //To sort left part
        mergeSort(arr,start,mid);
        
        //To sort right part
        mergeSort(arr,mid+1,end);
        
        //To merge both the parts
        merge(arr,start,end);
    }
    
    public static void merge(int arr[],int start,int end)
    {
        //To calculate mid
        int mid = (start+end)/2;
        
        //To calculate lengths of both the arrays
        int len1 = mid-start+1;
        int len2 = end-mid;
        
        //Creating two new arrays
        int first[] = new int[len1];
        int second[] = new int[len2];
        
        //Copying the elements from arr[] to first[] & second[]
        int k = start;
        for(int i=0;i<len1;i++)
        {
            first[i] = arr[k];
            k++;
        }
        k = mid+1;
        for(int i=0;i<len2;i++)
        {
            second[i] = arr[k];
            k++;
        }
        
        //Merge two sorted arrays
        int index1 = 0;
        int index2 = 0;
        k = start;
        
        while(index1 < len1 && index2 < len2)
        {
            if(first[index1] < second[index2])
            {
                arr[k++] = first[index1++];
            }
            else
            {
                arr[k++] = second[index2++];
            }
        }
        while(index1 < len1)
        {
            arr[k++] = first[index1++];
        }
        while(index2 < len2)
        {
            arr[k++] = second[index2++];
        }
    }
}
