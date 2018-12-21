package ListAndSort.test9;

import java.util.ArrayList;
import java.util.List;

/**
 * 解法有误，想不到更妙的解法，看了答案
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
            for (int i = 0 ; i < intervals.size() ; i ++) {
                for (int j = i + 1 ; j < intervals.size() ; j ++) {
                        if ((intervals.get(i).end >= intervals.get(j).start && intervals.get(i).start <= intervals.get(j).start) || (intervals.get(i).start <= intervals.get(j).end && intervals.get(j).end <= intervals.get(i).end) || (intervals.get(i).start <= intervals.get(j).start && intervals.get(i).end >= intervals.get(j).end) || (intervals.get(i).start >= intervals.get(j).start && intervals.get(i).end <= intervals.get(j).end)) {
                            int start =  Math.min(intervals.get(j).start , intervals.get(i).start);
                            int end = Math.max(intervals.get(j).end , intervals.get(i).end);
                            intervals.set(i , new Interval(Math.min(intervals.get(j).start , intervals.get(i).start) , Math.max(intervals.get(j).end , intervals.get(i).end)));
                             intervals.remove(j);
                             j --;   //注意
                        }
                }
            }
            return intervals;
    }
    public static void main(String args[]) {
       List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(2,3));
        intervals.add(new Interval(4,5));
        intervals.add(new Interval(6,7));
        intervals.add(new Interval(8,9));
        intervals.add(new Interval(1 , 10));
        Solution solution = new Solution();
        solution.merge(intervals);
    }
}
