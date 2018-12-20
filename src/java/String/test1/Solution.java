package String.test1;

import java.util.HashMap;
import java.util.Map;

/**
 * 之前有看过官方解法。声明一个map里面存放已经经过的字符的位置
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character , Integer> index = new HashMap<>();
        int max = 0;
        int j = 0 ;                           //子字符串的起始指针
        if (s.equals(" "))
            return 1;
        for(int i = 0 ; i < s.length() ; i ++) {
            if (index.get(s.charAt(i)) == null || index.get(s.charAt(i)) < j) {               //第二个边界条件很容易忽略。若当前字符保存位置在起始指针j之前的，也说明该字符不在当前的字符串内
                index.put(s.charAt(i) , i);
            }
            else {
                max = Math.max(i - j , max);
                j = index.get(s.charAt(i)) + 1;
                index.put(s.charAt(i) , i);
            }
        }
        max = Math.max(max , s.length() - j);
        return max;
    }
    public static void main(String args[]) {
        String s = " ";
        Solution solution = new Solution();
        solution.lengthOfLongestSubstring(s);
    }
}
