package TwoPointer;

public class ValidPalindrome {
    public static boolean function(String s)
    {
        /* s-> madame
        "dead"
        abca
        tebbem
         tmbebm
        eeccccbebaeeabebccceea
         */

        int start=0,end=s.length()-1;
        int ops=0;
        while (start<=end)
        {
            if(s.charAt(start)!=s.charAt(end)) {
                if(checkPalin(s,start,end-1)||checkPalin(s,start+1,end))
                    return true;
            }
            start++;
            end--;

        }
        return true;
    }

    private static boolean checkPalin(String s, int start, int i) {
        while(start<=i)
        {
            if(s.charAt(start)!=s.charAt(i))
                return false;

            start++;
            i--;
        }
        return false;
    }


}
