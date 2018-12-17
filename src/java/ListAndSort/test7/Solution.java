package ListAndSort.test7;

import java.util.ArrayList;

public class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder builder = new StringBuilder();
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i = 1 ; i <= n ; i ++) {
            integerArrayList.add(i);
        }
        int temp = k;
        for(int i = n ; i > 0 ; i --) {
              int index = temp / (factorial(i -1));                 //这边求索引的时候会出点问题，在于正好是阶乘的整数倍的时候
              if(temp % (factorial(i -1)) == 0) {
                  index -- ;
              }
              temp = temp -  index * factorial(i -1);                  //这步比较关键，不是简简单单地用除
              builder.append(integerArrayList.get(index));
              integerArrayList.remove(index);
        }
        return builder.toString();
    }
    public static int factorial(int number) {
        int result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }
}
