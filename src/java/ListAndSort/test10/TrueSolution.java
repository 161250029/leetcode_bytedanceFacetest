package ListAndSort.test10;

/**
 * 参考了一个精妙的算法 ，代码都是自己手动撸的
 * 算出每一个柱子左边和右边的最高柱子，然后得出在这个点能存储多少水
 */
public class TrueSolution {
    public int trap(int[] height) {
         int result = 0;
         int[] maxL = new int[height.length];
         int[] maxR = new int[height.length];
         for (int i = 0 ; i < maxL.length ; i ++) {       //巧妙地计算出所有点对应的在其左边最大的数值，复杂度为o(n)，值得学习
             if (i == 0) {
                 maxL[i] = 0;
                 continue;
             }
             maxL[i] = Math.max(height[i - 1] , maxL[i - 1]);
         }
         for (int i = maxR.length - 1 ; i >= 0  ; i --) {  //巧妙地计算出所有点对应的在其右边最大的数值，复杂度为o(n)，值得学习
              if (i == maxR.length - 1) {
                   maxR[i] = 0;
                   continue;
              }
              maxR[i] = Math.max(height[i + 1] , maxR[i + 1]);
         }
         for (int i = 0 ; i < height.length ; i ++) {
             if (height[i] < maxL[i] && height[i] < maxR[i])
                 result += Math.min(maxL[i] , maxR[i]) - height[i];
         }
         return result;
    }
}
