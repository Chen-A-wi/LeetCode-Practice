//A phrase is a palindrome if, after converting all uppercase letters into 
//lowercase letters and removing all non-alphanumeric characters, it reads the same 
//forward and backward. Alphanumeric characters include letters and numbers. 
//
// Given a string s, return true if it is a palindrome, or false otherwise. 
//
// 
// Example 1: 
//
// 
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
// 
//
// Example 2: 
//
// 
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
// 
//
// Example 3: 
//
// 
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric 
//characters.
//Since an empty string reads the same forward and backward, it is a palindrome.
//
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 2 * 10⁵ 
// s consists only of printable ASCII characters. 
// 
// Related Topics Two Pointers String 👍 4156 👎 5548


//leetcode submit region begin(Prohibit modification and deletion)
class ValidPalindromeSolution {
    fun isPalindrome(s: String): Boolean {
        return if (s.isBlank()) {
            true
        } else if (s.length == 1) {
            true
        } else {
            val filterS = s.lowercase().filter { it in 'a'..'z' || it in '0'..'9' }
            var sIndex = 0
            var eIndex = filterS.lastIndex

            while (sIndex < eIndex) {
                if (filterS[sIndex] != filterS[eIndex]) {
                    return false
                }
                sIndex++
                eIndex--
            }
            true
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
