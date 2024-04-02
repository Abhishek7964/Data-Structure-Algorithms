import java.util.*;
class InsertionSort
{
    public static void main(String[] args)
    {
        int arr[] = {2,0,6,78,9,13};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int j = 0;
            int temp = arr[i];
            for(j=i-1;j>=0;j--)
            {
                if(arr[j] > temp)
                {
                    arr[j+1] = arr[j];
                }
                else
                {
                    break;
                }
            }
            arr[j+1] = temp;
        }
    }
}
