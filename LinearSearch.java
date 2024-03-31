class LinearSearch
{
    public static void main(String[] args)
    {
       int arr[] = {7,0,2,9,3,10};
       int keyElement = 9;
       System.out.print(linearSearch(arr,keyElement));
    }
    
    public static int linearSearch(int arr[],int keyElement)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==keyElement)
            {
                return i;
            }
        }
        return 0;
    }
}
