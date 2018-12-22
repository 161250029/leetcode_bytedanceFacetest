package ListAndSort.test10;

public class Solution {
    public int trap(int[] height) {
         int result = 0 ;
         for (int i = 0 ; i < height.length - 1 ; i ++) {
             int width = height[i];
             if (getEQIndex(i , height) != -1 && getEQIndex(i , height) != i + 1) {
                 for (int j = i + 1; j < getEQIndex(i , height) ; j ++) {
                     result += (width - height[j]);
                 }
                 i = getEQIndex(i , height) - 1;     //这步不能缺少 , 并且还要注意需要减一
             }
         }
         return result;
    }
    public int getEQIndex(int i , int[] height) {
        int index = -1;
         for (int j = i + 1 ; j < height.length ; j ++) {
             if (height[j] >= height[i]) {
                 return j;
             }
         }
         return index;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        solution.trap(height);
    }


}
