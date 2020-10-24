//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
// Related Topics 数学 
// 👍 2228 👎 0

package editor.cn;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Java：整数反转
public class Q7ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new Q7ReverseInteger().new Solution();
        // test
        System.out.println(solution.reverse(-123123));

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {
            int rest = Math.abs(x);
            long sum = 0;
            while (rest != 0) {
                sum = sum * 10 + rest % 10;
                rest = rest / 10;
            }
            if (x < 0) {
                sum = -sum;
            }
            if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
                return 0;
            } else {
                return (int) sum;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}