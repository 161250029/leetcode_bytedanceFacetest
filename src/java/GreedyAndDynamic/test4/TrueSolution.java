package GreedyAndDynamic.test4;

//纯自己手撸，没看任何参考 。可能花了一个小时多点。 通过
public class TrueSolution {
    public int maxSubArray(int[] nums) {
        int temp = nums[0];   //记录每一段最大子序列的值
        int max = nums[0];     //保存最大的子序列值
        if(nums.length == 1)
            return nums[0];
        for(int i = 1 ; i < nums.length ; i ++) {
            if(temp > max) {
                if (temp > 0) {
                    max = temp;
                    temp = temp + nums[i];
                }
                else {
                    max = temp;
                    temp = nums[i];
                }
                if(i == nums.length - 1) {
                    max = Math.max(max , temp);
                }
            }
            else {
                if(temp < 0) {
                    temp = nums[i];
                    if(i == nums.length - 1) {
                        max = Math.max(max , temp);
                    }
                    continue;
                }
                temp = temp + nums[i];
                if(i == nums.length - 1) {
                    max = Math.max(max , temp);
                }
            }

        }
        return  max;
    }

    public static void main(String args[]) {
        TrueSolution solution = new TrueSolution();
        int[] nums = {-3,-2,0,-1};
        solution.maxSubArray(nums);
    }
}
