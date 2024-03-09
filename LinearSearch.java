class Main
{
    public static void main(String[] args)
    {
        int data[] = {31,23,7,58,91,3};
        System.out.print(LinearSearch.linearSearch(data,0,data.length-1,3));
    }
}
 
class LinearSearch
{
    static int linearSearch(int arr[],int start, int end,int key)
    {
        while(start<=end)
        {
            if(arr[start]==key)
            {
                return start;
            }
            start++;
        }
        return 0;
    }
}