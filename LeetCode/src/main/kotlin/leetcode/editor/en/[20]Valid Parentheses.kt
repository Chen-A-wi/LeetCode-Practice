//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']
//', determine if the input string is valid. 
//
// An input string is valid if: 
//
// 
// Open brackets must be closed by the same type of brackets. 
// Open brackets must be closed in the correct order. 
// 
//
// 
// Example 1: 
//
// 
//Input: s = "()"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: s = "()[]{}"
//Output: true
// 
//
// Example 3: 
//
// 
//Input: s = "(]"
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁴ 
// s consists of parentheses only '()[]{}'. 
// 
// Related Topics String Stack 👍 13730 👎 629


//leetcode submit region begin(Prohibit modification and deletion)
class ValidParenthesesSolution {
    fun isValid(s: String): Boolean {
        return if (s.length % 2 != 0) { //閉合一定是成雙成對的，所以先濾掉單數
            false
        } else {
            var checkString = s

            //閉合一定有頭尾，先把一組的去掉，濾到最後得到的就是答案了
            while (checkString.isNotEmpty()) {
                checkString = if (checkString.contains("{}")) {
                    checkString.replace("{}", "")
                } else if (checkString.contains("[]")) {
                    checkString.replace("[]", "")
                } else if (checkString.contains("()")) {
                    checkString.replace("()", "")
                } else {
                    return false
                }
            }
            return true
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
