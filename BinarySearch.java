class Main
{
    public static void main(String[] args)
    {
        int data[] = {31,23,7,58,91,3};
        System.out.print(BinarySearch.binarySearch(data,0,data.length-1,58));
    }
}
 
class BinarySearch
{
    static int binarySearch(int arr[],int start,int end,int key)
    {
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid] == key)
            {
                return mid;
            }
            if(arr[mid]>key)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return 0;
    }
}