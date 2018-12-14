package String.test4;

// 还有另外的解法 ， 就是先将每一位对应的乘积值求出来。然后再对这个数组进行处理。   这里我没有写，有实现一下。
public class BestSolution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        StringBuilder builder = new StringBuilder();
        int length1 = num1.length();
        int length2 = num2.length();
        int all = length1 + length2;
        int[] result = new int[all];
        for(int i = length1 -1 ; i >= 0 ; i --) {
            int carry = 0;                     //从第一位开始算的时候无进位
            for(int j = length2 - 1; j >= 0 ; j --) {
                int temp = (num1.charAt(i) - 48) * (num2.charAt(j) - 48) + result[i + j + 1] + carry;
                result[i + j + 1] = temp % 10;
                carry = temp / 10;
            }
            result[i] = carry;
        }

        //在这里作出优化 ， 只用一次循环
            for(int i = 0 ; i < result.length ; i ++) {
                if(result[i] == 0 && i == 0) {
                    continue;
                }
                builder.append(result[i]);
            }
        return builder.toString();
    }
}
