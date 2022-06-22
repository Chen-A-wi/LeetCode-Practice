package longest_common_prefix

import LongestCommonPrefixSolution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LongestCommonPrefixSolutionTest {
    private val longestCommonPrefixSolution = LongestCommonPrefixSolution()

    @Test
    @DisplayName("Example 1")
    fun test1() {
        Assertions.assertEquals(
            "fl",
            longestCommonPrefixSolution.longestCommonPrefix(arrayOf("flower", "flow", "flight"))
        )
    }

    @Test
    @DisplayName("Example 2")
    fun test2() {
        Assertions.assertEquals("", longestCommonPrefixSolution.longestCommonPrefix(arrayOf("dog", "racecar", "car")))
    }

    @Test
    @DisplayName("Example 3")
    fun test3() {
        Assertions.assertEquals("a", longestCommonPrefixSolution.longestCommonPrefix(arrayOf("a")))
    }

    @Test
    @DisplayName("Example 4")
    fun test4() {
        Assertions.assertEquals("c", longestCommonPrefixSolution.longestCommonPrefix(arrayOf("cir", "car")))
    }

    @Test
    @DisplayName("Example 5")
    fun test5() {
        Assertions.assertEquals(
            "",
            longestCommonPrefixSolution.longestCommonPrefix(arrayOf("reflower", "flow", "flight"))
        )
    }
}