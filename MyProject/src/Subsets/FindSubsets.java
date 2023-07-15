package Subsets;

import java.util.*;

public class FindSubsets {
    public static List<List<Integer>> findAllSubsets(int[] nums)
    {
        /*
          1 2 3
          [] 1
          [] [2]  1 [12]
          [] [3] [2] [23]  [1] [13] [12] [123]
         */
        List<List<Integer>> ans = new ArrayList<>();
         subsets(nums,ans,new ArrayList<>(),0);
         return ans;
    }

    private static void subsets(int[] nums, List<List<Integer>> ans, ArrayList<Integer> res,int index) {

        ans.add(new ArrayList<>(res));// -> ans -> {{},{1},{1,2}}

        for(int i=index;i<nums.length;i++)
        {
            res.add(nums[i]); //{1}
            subsets(nums,ans,res,i+1);
            res.remove(res.size()-1);
        }

    }

    static void generatePermutations(String word, List<List<String>> res, List<String> ans,int index)
    {
        // abc
        if(ans.size()>=word.length()) {
            res.add(new ArrayList<>(ans));
        }

        for(int i=0;i<word.length();i++)
        {
            if(ans.contains(String.valueOf(word.charAt(i)))) continue;
           ans.add(String.valueOf(word.charAt(i)));
           generatePermutations(word, res, ans,i);
           ans.remove(ans.size()-1);
        }
    }

    public static List<List<String>> permuteWord(String word)
    {
        // "abc"
        List<List<String>> res = new ArrayList<>();
        generatePermutations(word,res,new ArrayList<>(),0);
        return res;
    }
    public static List<String> letterCombinations(String digits)
    {
        /*
         digit -> 23
         2-> abc
         3-> def
         */
        Map<Integer,String> mapping= new HashMap<>();
        mapping.put(1,"");
        mapping.put(2,"abc");
        mapping.put(3,"def");
        mapping.put(7,"pqrs");
        mapping.put(9,"wxyz");
        String[] lettersMap = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        geberateCombination(res,digits,lettersMap,0,sb);
        return res;

    }

    private static void geberateCombination(List<String> res, String digits,String[] lettersMap, int index,StringBuilder sb) {

        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }
        int number = digits.charAt(index) - '0';
        String numStr = lettersMap[number];
        for(int i=0;i<numStr.length();i++)
        {
            sb.append(numStr.charAt(i));
            geberateCombination(res,digits,lettersMap,index+1,sb);
            sb.deleteCharAt(sb.length()-1);


        }
    }

    public static ArrayList<String> generateCombinations(int n)
    {
        /*
          3
          ()()()
          (())()
         */
        ArrayList<String> res  = new ArrayList<>();
        func(n,0,0,"",res);
        return res;

    }

    private static void func(int n, int open, int close, String sb, ArrayList<String> res) {
        if(sb.length()>=2*n)
        {
            res.add(sb);

        }
        if(open<n)
        {
            func(n,open+1,close,sb+"(",res);
        }
        if(close<open && close<n)
        {
            func(n,open,close+1,sb+")",res);
        }
    }


}
