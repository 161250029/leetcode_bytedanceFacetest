package String.test2;

/**
 * 我的版本： 通过
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = 1000;
        String prefix = "";
        for(String str : strs) {
            min = Math.min(str.length() , min);
        }
        boolean flag = true;
        if(strs.length == 1) {
            return strs[0];
        }
        for(int i = 0 ; i < min ; i ++) {
            if(flag) {
                int count = 0 ;
                for(int j = 0 ; j < strs.length - 1 ; j ++) {
                    if(strs[j].charAt(i) == strs[j + 1].charAt(i) ) {
                        if(j == strs.length - 2) {
                            prefix += strs[j].charAt(i);
                        }
                        continue;
                    }
                    else {
                        flag = false;
                        break;
                    }
                }
            }
        }
        return prefix;
    }

    public static void main(String args[]) {
        String[] strs = {"",""};
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(strs));
    }
}
