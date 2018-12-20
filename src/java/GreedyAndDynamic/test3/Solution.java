package GreedyAndDynamic.test3;

/**
 * DFS,深度优先遍历，先往纵向一直遍历，再往横向遍历。得出最终是正方形的条件：纵向的次数乘以 （纵向的次数+1）（即正方形的长度）等于横向的次数. 思想错误了
 */

/**
 * 麻烦的解法，通过，但效率低。
 */
public class Solution {
    public int maximalSquare(char[][] matrix) {
        int max = 0 ;
        for (int i = 0 ; i < matrix.length ; i ++) {
            for (int j = 0 ; j < matrix[0].length ; j ++) {
                if (matrix[i][j] == '0')
                    continue;
                else if ((j != matrix[0].length - 1 && matrix[i][j + 1] == '0') || (i != matrix.length - 1 &&matrix[i + 1][j] == '0'))
                    max = Math.max(1 , max);
                else {
                    int deepth = 0;
                    for (int k = i ; k < matrix.length ; k ++ ) {
                        if (matrix[k][j ] != '1')
                            break;
                        deepth ++;
                    }
                    if (deepth == 1)
                        max = Math.max(1 , max);
                    if (deepth > matrix[0].length) deepth = matrix[0].length;                            //这步需要注意一下
                    for (int l = deepth ; l > 1 ; l --) {                                                //必须对每一个最大深度都要检查一遍
                        if (j + deepth <= matrix[0].length && isValid(l , i , j , matrix)) {
                            max = Math.max(l * l , max);
                            break;
                        }
                    }
                }

            }
        }
        return max;
    }

    public boolean isValid(int deepth , int i , int j ,char[][] matrix) {
        boolean flag = true;
        for (int k = i ; k < i + deepth; k ++) {
            for (int l = j ; l < j + deepth ; l ++) {
                if (matrix[k][l] != '1') {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    public static void main(String args[]) {
        //char[][] matrix = {{'0','0','1','0'},{'1','1','1','1'},{'1','1','1','1'},{'1','1','1','0'},{'1','1','0','0'},{'1','1','1','1'},{'1','1','1','0'}};
        char[][] matrix = {{'1','1','0','1'},{'1','1','0','1'},{'1','1','1','1'}};
        Solution solution = new Solution();
        solution.maximalSquare(matrix);
    }

}
