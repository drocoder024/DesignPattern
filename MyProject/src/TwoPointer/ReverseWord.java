package TwoPointer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ReverseWord {
        public static String reverseWords(String s) {
            if(s.length()==0|| s==null) return null;

            Stack<String> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();

            for(int i=0;i<s.length();i++)
            {
                StringBuilder word=new StringBuilder();
                if(s.charAt(i)==' ')continue;
                while(i<s.length() && s.charAt(i)!=' ')
                {
                    word.append(s.charAt(i));
                    i++;
                }
                stack.push(word.toString());
            }

            while(!stack.isEmpty())
            {
                sb.append(stack.peek());
                stack.pop();

            }
            return sb.toString();
        }
        public static String reverseWords_1(String s) {
            /*

            s  -> "Hello     Miss   supriya"
            add it to front of deque
             Supriya-Miss- Hello

             Join contents of deque using String delimiter


             */
                int left = 0;
                int right = s.length() - 1;

                while (left < right && s.charAt(left) == ' ') left++;
                while (left < right && s.charAt(right) == ' ') right--;

                Deque<String> d = new ArrayDeque();
                StringBuilder word = new StringBuilder();

                while (left <= right) {
                    if (s.charAt(left) != ' ') {
                        word.append(s.charAt(left));
                    } else if(word.length()!=0 && s.charAt(left)==' ') {

                        d.offerFirst(word.toString());
                        word.setLength(0);
                    }
                    left++;
                }
               d.offerFirst(word.toString());

                return String.join(" ",d);
            }
        }
