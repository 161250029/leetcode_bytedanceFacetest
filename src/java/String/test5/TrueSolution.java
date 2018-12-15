package String.test5;

public class TrueSolution {
    public String reverseWords(String s) {
        String temp = s.trim();               //删除字符串的头尾空白符
        String[] split = temp.split(" ");
        String result = "";
        for(int i = split.length ; i >= 0 ; i --) {
            if(split[i].equals("") || split.equals(" ")) {
                continue;
            }
            result = result + " " + split[i];
        }
        return result.substring(1);
    }
}
