package ListAndSort.test4;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int j = 0;
        if(nums.length == 0 || nums == null)
            return 0;
        for(int i = 0; i < nums.length ; i ++) {
            if(i != nums.length - 1 && nums[i] < nums[i + 1]) {

            }
            else {
                max = Math.max(i - j + 1 , max);
                j = i + 1;
            }
        }
        return max;
    }
    public static void main(String args[]) {
        Solution solution = new Solution();
        int[] nums = {1,3,5,4,7};
        System.out.println(solution.findLengthOfLCIS(nums));
    }
}
