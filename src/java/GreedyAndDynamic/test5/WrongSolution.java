package GreedyAndDynamic.test5;

import java.util.List;

/**
 * 自顶向下遍历算法不行，因为最后一个数组内包含多个值，所以思索一下采取自底向上
 */
public class WrongSolution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int lastIndex =0;
        int result = triangle.get(0).get(0);
        for(int i = 1 ; i < triangle.size() ; i ++ ) {
            if(triangle.get(i).get(lastIndex + 1) < triangle.get(i).get(lastIndex)) {
                result = result + triangle.get(i).get(lastIndex + 1);
                lastIndex = lastIndex + 1;
            }
            else {
                result = result + triangle.get(i).get(lastIndex);
            }
        }
        return result;
    }
}
