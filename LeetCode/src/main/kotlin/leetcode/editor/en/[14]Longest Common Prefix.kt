//Write a function to find the longest common prefix string amongst an array of 
//strings. 
//
// If there is no common prefix, return an empty string "". 
//
// 
// Example 1: 
//
// 
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
// 
//
// Example 2: 
//
// 
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 
//
// 
// Constraints: 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] consists of only lowercase English letters. 
// 
// Related Topics String 👍 8549 👎 3118


//leetcode submit region begin(Prohibit modification and deletion)
class LongestCommonPrefixSolution {
    fun longestCommonPrefix(strs: Array<String>): String {
        return if (strs.isEmpty()) {
            ""
        } else {
            var answer = strs.first()

            for (i in strs.indices) {
                while (strs[i].indexOf(answer) != 0) {
                    answer = answer.substring(0, answer.length - 1)
                    if (answer.isEmpty()) {
                        return ""
                    }
                }
            }

            return answer
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
