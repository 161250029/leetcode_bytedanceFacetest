package ListAndSort.test8;

import java.util.HashMap;
import java.util.Map;

/**
 * 个人思路：一行其实就代表一个学生的朋友。 算法：朋友就合并，不是就不合并，算法应该是O(n 2) ， 算法错了，只能用深度优先或者广度优先
 */
public class Solution {
    public int findCircleNum(int[][] M) {
        int result = 0;
        Map<int[] , Boolean> map = new HashMap<>();
        for (int i = 0 ; i < M.length ; i ++) {
            for(int j = 0 ; j < M.length ; j ++) {
                if (map.get(M[i]) == null && map.get(M[i]) == null &&M[i][j] == 1 && i != j) {
                    for (int k = 0 ; k < M[0].length ; k ++) {
                        if (M[i][k] == 1 && M[j][k] == 0) {
                            M[j][k] = 1;
                        }
                    }
                    map.put(M[i] ,false);
                }
            }
        }
        return M.length - map.keySet().size();
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        int[][] M = {{1,1,0 },{1,1,0 },{0,0,1 } };
        solution.findCircleNum(M);
    }
}
