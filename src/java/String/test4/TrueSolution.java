package String.test4;
//这道题进位有点东西的
public class TrueSolution {
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
        if (result[0] !=0) {
            for(int i = 0 ; i < result.length ; i ++) {
                builder.append(result[i]);
            }
        }
        else {
            for(int i = 1 ; i < result.length ; i ++) {
                builder.append(result[i]);
            }
        }
        return builder.toString();
      }
    public static void main(String args[]) {
        TrueSolution trueSolution = new TrueSolution();
        System.out.println(trueSolution.multiply("123" , "456"));
    }
}
