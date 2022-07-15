package valid_palindrome_ll

import ValidPalindrome2Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ValidPalindrome2SolutionTest {
    private val validPalindrome2Solution = ValidPalindrome2Solution()

    @Test
    @DisplayName("Example 1")
    fun test1() {
        Assertions.assertEquals(true, validPalindrome2Solution.validPalindrome(s = "aba"))
    }

    @Test
    @DisplayName("Example 2")
    fun test2() {
        Assertions.assertEquals(true, validPalindrome2Solution.validPalindrome(s = "abca"))
    }

    @Test
    @DisplayName("Example 3")
    fun test3() {
        Assertions.assertEquals(false, validPalindrome2Solution.validPalindrome(s = "abc"))
    }

    @Test
    @DisplayName("Example 4")
    fun test4() {
        Assertions.assertEquals(true, validPalindrome2Solution.validPalindrome(s = "cbbcc"))
    }

    @Test
    @DisplayName("Example 5")
    fun test5() {
        Assertions.assertEquals(true, validPalindrome2Solution.validPalindrome(s = "yd"))
    }
}