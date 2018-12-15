package ListAndSort.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);                //对数组进行排序
        for(int k = 0 ; k < nums.length ; k ++) {
              if(nums[k] > 0)
                  break;
              if(k > 0 && nums[k] == nums[k - 1])               //这里必须是和前一位相比
                  continue;
              int i = k + 1;        //从第一个数的下一位取值
              int j = nums.length - 1;         //两个指针控制区间
              int value = - nums[k];
              while (i < j) {
                  if(value == nums[i] + nums[j]) {
                      List<Integer> list = new ArrayList<>();
                      list.add(nums[k]); list.add(nums[i]); list.add(nums[j]);
                      lists.add(list);
                      while (i < j && nums[i] == nums[i + 1]) {            //防止指针越界 ， 因为是在i到j的区间里
                           i ++ ;
                      }
                      while (i < j && nums[j] == nums[j - 1]) {
                          j -- ;
                      }
                      ++ i ; -- j;
                  }
                  else  if (value < nums[i] + nums[j]) {
                      j --;
                  }
                  else {
                      i ++;
                  }
              }

        }
        return lists;
    }
    public static void main(String args[]) {
        Solution solution = new Solution();
        int [] nums = {-1,0,1,2,-1,-4};
        //int [] nums = {0,0,0};
        System.out.println(solution.threeSum(nums));
    }
}
