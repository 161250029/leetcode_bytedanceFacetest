package ListAndSort.test9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 看了答案。感觉用到了java的泛型，以及重写比较器。学到了，有点东西。 需要重写一遍
 */
public class TrueSolution {
    /**
     * @param intervals: Sorted interval list.
     * @return: A new sorted interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        if(intervals == null || intervals.size()<=1){
            return intervals;
        }
        Collections.sort(intervals,new IntervalComparator());
        List<Interval> result = new ArrayList<Interval>();
        Interval last = intervals.get(0);
        for(int i=1;i<intervals.size();i++){
            Interval curt = intervals.get(i);
            if(curt.start<=last.end){
                last.end = Math.max(last.end,curt.end);
            }else{
                result.add(last);
                last = curt;
            }
        }
        result.add(last);
        return result;
    }
    private class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval a,Interval b){
            return a.start - b.start;
        }
    }
}
