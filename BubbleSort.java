import java.util.Arrays;
class Main
{
    public static void main(String[] args)
    {
        int arr[] = {44,81,-100,0,0,0,-1,-2,1000};
        int n = arr.length; //8
        for(int i=1;i<=n-1;i++) //8-1
        {
            int k = 1;
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[k])
                {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
                k++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}