package GreedyAndDynamic.test5;
import java.util.List;

/**
 * 没有查询任何资料，但之前有涉及过。自己思考，很有成就感
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int result = 0;
        for(int i = triangle.size() - 2 ; i >= 0 ; i -- ) {
             int nextLine = i + 1;
             List<Integer> current = triangle.get(i);
             List<Integer> next = triangle.get(nextLine);
             for(int j = 0 ; j <= i ; j ++) {
                 int min = Math.min(next.get(j) , next.get(j + 1));
                 current.set(j , current.get(j) + min);
             }
             if (i == 0 ) {
                 result = current.get(0);
             }
        }
        return result;
    }
}
