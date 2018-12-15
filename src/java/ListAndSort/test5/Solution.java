package ListAndSort.test5;

import java.util.*;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
//        Map<Integer , Integer> map = new HashMap();
//        for(int i = 0 ; i < nums.length ; i ++ ) {
//            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
//        }
//        Set<Integer> set = map.keySet();
//        Set<Integer> sortSet = new TreeSet<Integer>((o1, o2) -> o2.compareTo(o1));
//        sortSet.addAll(set);
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(solution.findKthLargest(nums , k));
    }
}
