package TwoPointer;

import java.util.Arrays;

public class SumOfThree {
    public static boolean checkSum(int[]arr,int target)
    {
        /* arr[] -> {3, 7, 1, 2, 8, 4, 5}

        1 2 3 4 5 7 8
        target - 1+2+7 11

      target -> 10 */
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            int j =i+1;
            int k=arr.length-1;

            while(j<k)
            {
                int sum = arr[i]+arr[j]+arr[k];
                if(sum==target)
                {
                    return true;
                } else if(sum>target)
                {
                    k--;
                } else
                {
                    j++;
                }
            }
        }
        return  false;
    }
}

