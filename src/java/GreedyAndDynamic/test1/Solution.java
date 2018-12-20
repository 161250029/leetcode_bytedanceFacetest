package GreedyAndDynamic.test1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0 ; i < prices.length - 1 ; i ++) {
             max = Math.max(max , getMax(i , prices));
        }
        return  max;
    }
    public int getMax(int index , int[] prices) {
        int max = 0 ;
         for(int i = index + 1 ; i < prices.length ; i ++) {
             if (prices[index] < prices[i])
                 max = Math.max(max , prices[i] - prices[index]);
         }
         return max;
    }
}
