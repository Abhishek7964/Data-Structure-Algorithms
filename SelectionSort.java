import java.util.Arrays;
class Main
{
    public static void main(String[] args)
    {
        int arr[] = {64,25,12,22,11};
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            int minIndex = i;
            int min = arr[i];
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<=arr[minIndex])
                {
                    minIndex = j;
                }
            }    
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.print(Arrays.toString(arr));
    }
}