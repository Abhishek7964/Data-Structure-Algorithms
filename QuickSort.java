import java.util.Arrays;
class Main
{
    public static void main(String[] args)
    {
        int data[] = {8,2,0,1,5,2};
        int n = data.length;
        
        QuickSort.quickSort(data,0,n-1);
        
        System.out.print(Arrays.toString(data));
    }
}

class QuickSort
{
    static void quickSort(int arr[],int start,int end)
    {
        //base condition
        if(start>=end)
        {
            return;
        }
        
        //partition krenge
        int p = partition(arr,start,end);
        
        //left wala part sort krenge
        QuickSort.quickSort(arr,start,p-1);
        
         //right wala part sort krenge
        QuickSort.quickSort(arr,p+1,end);
    }
    
    static int partition(int arr[],int start,int end)
    {
        int pivot = arr[start];
        int count = 0;
        for(int i=start+1;i<=end;i++)
        {
            if(arr[i]<=pivot)
            {
                count++;
            }
        }
        
        //place pivot at right position
        int pivotIndex = start + count;
        int temp = arr[start];
        arr[start] = arr[pivotIndex];
        arr[pivotIndex] = temp;
        
        //left & right wala part sambhal lete h
        int i = start;
        int j = end;
        
        while(i<pivotIndex && j>pivotIndex)
        {
            while(arr[i]<=pivot)
            {
                i++;
            }
            
            while(arr[j]>pivot)
            {
                j--;
            }
            
            if(i<pivotIndex && j>pivotIndex)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return pivotIndex;
    }
}