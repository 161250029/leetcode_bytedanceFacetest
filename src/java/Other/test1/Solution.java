package Other.test1;

//有点问题
class Solution {
    public int mySqrt(int x) {
        int ans = -1;
        if (0 == x){
            return 0;
        }
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {               //这里的条件判断为什么不能mid*mid <= x呢
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;

    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        solution.mySqrt(3);
    }
}