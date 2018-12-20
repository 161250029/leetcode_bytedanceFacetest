package String.test6;


/**
 *我的思路是从后向前遍历。 总结：自己考虑问题复杂了
 * 但是正向遍历貌似更好 ，遇到时目录的就加入list中，遇到..，就删去前一个
 */
public class Solution {
    public String simplifyPath(String path) {
        if(path.equals("/../")) {
            return "/";
        }
        String[] split = path.split("/");
        String[] result = path.split("/");
        int index = 0;
        int count = 0;
        boolean flagSpecial = true;
        for(int i = split.length - 1 ; i >= 0 ; i --) {
            if (split[i].equals("") || split[i].equals("."))              // .是无用符号
                continue;
            else if (split[i].equals("..")) {
                count ++;
                continue;
            }
            else {
                flagSpecial = false;
                if (count == 0) {
                    result[index ++] = split[i];
                }
                else
                    count --;
            }
        }
        if(flagSpecial || index == 0) {           //这步很关键
            return "/";
        }
        String str = "";
        for (int i = index - 1 ; i >=0 ; i --) {
            str +=  "/" + result[i];
        }
        return  str;
    }
}
