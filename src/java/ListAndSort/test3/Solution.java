package ListAndSort.test3;

/**
 * de了一上午，终于解决了，开心。    可以优化，稍后继续。
 */
public class Solution {
    public int search(int[] nums, int target) {
        int result = -1;
        int left = 0 ; int right = nums.length - 1;
        while (left <= right) {
            int middle = (right - left)/2 +left;
            if (nums[middle] < target) {
                if(nums[middle] > nums[nums.length - 1]) {
                    if (target > nums[nums.length - 1])
                        left = middle + 1;
                    else if (target < nums[nums.length - 1])
                        left = middle + 1;
                    else {
                        result = nums.length - 1;
                        break;
                    }
                }
                if(nums[middle] < nums[nums.length - 1]) {
                    if (target > nums[nums.length - 1])
                        right = middle - 1;
                    else if (target < nums[nums.length - 1])
                        left = middle + 1;
                    else {
                        result = nums.length - 1;
                        break;
                    }
                }
                if(nums[middle] == nums[nums.length - 1]) {    //这步千万不能少 ,不然会死循环
                    break;
                }
            }
            if (nums[middle] > target) {
                if(nums[middle] > nums[nums.length - 1]) {
                    if (target > nums[nums.length - 1])
                        right = middle - 1;
                    else if (target < nums[nums.length - 1])
                        left = middle + 1;
                    else {
                        result = nums.length - 1;
                        break;
                    }
                }
                if(nums[middle] < nums[nums.length - 1]) {
                    if (target > nums[nums.length - 1])
                        right = middle - 1;
                    else if (target < nums[nums.length - 1])
                        right = middle - 1;
                    else {
                        result = nums.length - 1;
                        break;
                    }
                }
                if(nums[middle] == nums[nums.length - 1]) {           //这步千万不能少 ,不然会死循环
                    break;
                }
            }
            else if (nums[middle] == target){
                result = middle;
                break;
            }
        }
        return result;
    }
    public static void main(String args[]) {
        Solution solution = new Solution();
//        int[] nums = {
//                4,5,6,7,0,1,2
//        };
//        int target = 0;
//        int[] nums = {
//            1 , 3
//        };
//        int target = 0;
        int[] nums = {
                1
        };
        int target = 2;
        solution.search(nums , target);
    }

}
