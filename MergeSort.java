import java.util.Arrays;
class Main
{
    public static void main(String[] args)
    {
        int data[] = {38,27,43,3,9,82,10};
        int n = data.length-1;
        System.out.print("Unsorted Array: ");
        System.out.println(Arrays.toString(data));
        
        MergeSort.mergeSort(data,0,n);
        
        System.out.print("Sorted Array: ");
        System.out.println(Arrays.toString(data));
    }
}
class MergeSort
{
    static void mergeSort(int arr[],int start,int end)
    {
        //checking if base case
        if(start>=end)
        {
            return;
        }
        
        //calculating the mid
        int mid = (start+end)/2;
        
        //sorting the left side of array
        mergeSort(arr,start,mid);
        
        //sorting the right side of array
        mergeSort(arr,mid+1,end);
        
        //merging the sorted arrays
        merge(arr,start,end);
    }
    
    static void merge(int arr[],int start,int end)
    {
        //calculating mid
        int mid =(start+end)/2;
        
        //calculating lengths of the two new arrays
        int len1 = mid - start + 1;
        int len2 = end - mid;
        
        //declaring a new array with size len1 & len2
        int first[] = new int[len1];
        int second[] = new int[len2];
        
        //copying elements to the new array for start to mid
        int k = start;
        for(int i=0;i<len1;i++)
        {
            first[i] = arr[k++];
        }
        
        //copying elements to the new array for mid+1 to end
        k = mid+1;
        for(int i=0;i<len2;i++)
        {
            second[i] = arr[k++];
        }
        
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
