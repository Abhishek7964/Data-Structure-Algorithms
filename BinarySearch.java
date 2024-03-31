class BinarySearch
{
    public static void main(String[] args)
    {
       int arr[] = {7,0,2,9,3,10};
       int keyElement = 10;
       int start = 0;
       int end = arr.length - 1;
       System.out.print(binarySearch(arr,start,end,keyElement));
    }
    
    public static int binarySearch(int arr[],int start,int end,int keyElement)
    {
        //Repeat until start & end meet each other
        while(end>=start)
        {
            //Calculating mid value
            int mid = (start+end)/2;
            
            //If value found at mid position return the index
            if(arr[mid]==keyElement)
            {
                return mid;
            }
            
            //Search the left half
            if(arr[mid]>keyElement)
            {
                end = mid - 1;
            }
            
            //Search the right half
            if(arr[mid]<keyElement)
            {
                start = mid + 1;
            }
        }
        return 0;
    }
}
