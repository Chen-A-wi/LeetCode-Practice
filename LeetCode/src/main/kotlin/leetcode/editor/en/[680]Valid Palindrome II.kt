//Given a string s, return true if the s can be palindrome after deleting at 
//most one character from it. 
//
// 
// Example 1: 
//
// 
//Input: s = "aba"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: s = "abca"
//Output: true
//Explanation: You could delete the character 'c'.
// 
//
// Example 3: 
//
// 
//Input: s = "abc"
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁵ 
// s consists of lowercase English letters. 
// 
// Related Topics Two Pointers String Greedy 👍 5952 👎 318


//leetcode submit region begin(Prohibit modification and deletion)
class ValidPalindrome2Solution {
    fun validPalindrome(s: String): Boolean {
        var sStartIndex = 0
        var sEndIndex = s.lastIndex

        while (sStartIndex < sEndIndex) {
            if (s[sStartIndex] == s[sEndIndex]) {
                sStartIndex++
                sEndIndex--
            } else {
                return isPalindrome(
                    s = s,
                    startIndex = sStartIndex + 1,
                    endIndex = sEndIndex
                ) || isPalindrome(s = s, startIndex = sStartIndex, endIndex = sEndIndex - 1)
            }
        }
        return true
    }

    private fun isPalindrome(s: String, startIndex: Int, endIndex: Int): Boolean {
        var sIndex = startIndex
        var eIndex = endIndex

        while (sIndex < eIndex) {
            if (s[sIndex] != s[eIndex]) {
                return false
            } else {
                sIndex++
                eIndex--
            }
        }

        return true
    }
}
//leetcode submit region end(Prohibit modification and deletion)
