package String.test7;

import java.util.ArrayList;
import java.util.List;

/**
 * 暴力解法，算出每一位;一开始也没想出来。看了一下
 */
public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        for(int a = 1 ; a < 4 ; a ++)
            for (int b = 1 ; b < 4 ; b ++)
                for (int c = 1 ; c < 4 ; c ++)
                    for (int d = 1 ; d < 4 ; d ++) {
                          if (a+b+c+d == s.length()) {
                              int s1 = Integer.parseInt(s.substring(0 , a ));
                              int s2 = Integer.parseInt(s.substring(a  , a + b));
                              int s3 = Integer.parseInt(s.substring(a + b  , a + b + c ));
                              int s4 = Integer.parseInt(s.substring(a + b + c ));
                              if (s1 <= 255 && s2 <= 255 && s3 <= 255 && s4<=255) {
                                  String temp = s1 + "." + s2 + "." + s3 + "." +s4;
                                  //这不很容易忽略 。 考虑有一段为多个0的情况，转int时会直接缩掉
                                  if (temp.length() == s.length() + 3)
                                      result.add(temp);
                              }
                          }
                    }
                    return result;
    }
}
