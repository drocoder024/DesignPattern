package TwoPointer;

public class SortColors {
    static void swap(int[]arr,int a,int b)
    {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void sort(int[]arr,int n)
    {
        /*
        0, 0, 1, 1, 1, 2, 2
             p0           p2
                    p1
         */
        int p1=0;
        int p2=n-1;
        int p0=0;
        while(p1<p2)
        {
            if(arr[p1]==2)
            {
                swap(arr,p1,p2);
                p2--;
            } else if(arr[p1]==0)
            {
                swap(arr,p0,p1);
                p0++;
                p1++;
            } else
            {
                p1++;
            }
        }

    }
}

