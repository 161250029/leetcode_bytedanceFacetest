package Other.test2;

/**
 * 个人感觉思路挺好的 ，巧妙地应用了状态模式
 */
public class Solution {
    public boolean validUtf8(int[] data) {
        boolean flag = true;
            //使用状态模式
            int state = 0;         //记录接下来需要开头为10串的个数
            for (int i = 0 ; i < data.length ; i ++) {
                int current = 0;
                current = getBits(data[i]);
                switch(state) {
                    case 3 :
                        if (current == 1)
                            state --;
                        else
                            flag = false;
                        break;
                    case 1:
                        if (current == 1)
                            state --;
                        else
                            flag = false;
                        break;
                    case 2:
                        if (current == 1)
                            state --;
                        else
                            flag = false;
                        break;
                    case 0 :
                        if (current == 4)
                            state = 3;
                        else if (current == 3)
                            state = 2;
                        else if (current == 2)
                            state = 1;
                        else if (current == 0)
                            state = 0;
                        else
                            flag = false;
                        break;
                }
                if (!flag)
                    break;
            }
        if (flag && state == 0)
            flag = true;
        else
            flag = false;
        return flag;
    }
    public int getBits(int data) {
        String temp = "";
        int result = 0;
        while (data > 0) {
            temp = data%2 +temp;
            data = data/2;
        }
        if (temp.length() < 8) {                           //需要补全八位 ，遗漏就出错了
             for(int i = 1 ; i <= 8 - temp.length() ; i ++) {
                 temp = 0 +temp;
             }
        }

        for(int i = 0 ; i < temp.length() ; i ++) {
             if (temp.charAt(i) == '0')
                 break;
             result ++;
        }
        return result;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        int[] data = {197 , 130 ,1};
        solution.validUtf8(data);
    }

}
