package GreedyAndDynamic.test4;

import java.util.ArrayList;

/**
 * 一开始把题目理解错了 ， 以为是要求最大序列的长度。其实不需要result这个属性。 求最大值即可
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int j = 0;
        int result = 1 ;
        int temp = nums[0];   //记录每一段最大子序列的值
        int max = nums[0];     //保存最大的子序列值
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < nums.length ; i ++) {
            if(temp > max) {
                max = temp;
                temp = temp + nums[i];
                result = i - j + 1;
            }
            else {
                if(temp < 0) {
                    temp = nums[i];
                    j = i;
                    continue;
                }
                temp = temp + nums[i];
            }

          }
          return  max;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        solution.maxSubArray(nums);
    }
}
