package String.test5;

public class Solution {
    public String reverseWords(String s) {
        String temp = s.trim();               //删除字符串的头尾空白符
        temp = " "+ temp + " ";
        char[] CharArray = temp.toCharArray();
        System.out.println(CharArray.length);
        StringBuilder builder = new StringBuilder();
        String str = "";
        for(int i = CharArray.length - 1 , j = CharArray.length - 1 ; i > 0 ; i --) {
            if(CharArray[i] != 32 && CharArray[i - 1] == 32) {
                builder.append(str);
                builder.append(" ");
                str ="";
            }
            else if ((CharArray[i] == 32 && CharArray[i - 1] != 32) || (CharArray[i] != 32 && CharArray[i - 1] != 32)) {
                str = CharArray[i - 1]+str ;
            }
            else {
                continue;
            }
        }
        return builder.toString().substring(0 , builder.toString().length() -1);
    }
    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("1 "));
    }
}
