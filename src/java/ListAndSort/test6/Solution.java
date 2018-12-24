package ListAndSort.test6;

import java.util.Arrays;

//和最长连续递增及其相似
public class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        int max = 1;
        if(nums.length == 0 || nums == null)
            return 0;
        for(int i = 0 ; i < nums.length ;  i ++) {
            if (i != nums.length - 1 && nums[i] == nums[i + 1] - 1 );
            else if (i != nums.length - 1 && nums[i] == nums[i + 1])
                j ++ ;                                                     //相等的时候往后退一格，保持长度不变  ,之前忽略了这种情况。 想了想后修改了一下。
            else {
                max = Math.max(i - j + 1 , max);
                j = i + 1;
            }
        }
        return max;
    }
    public static void main(String args[]) {
        Solution solution = new Solution();
        int[] nums = {0,0};
        solution.longestConsecutive(nums);
    }
}
