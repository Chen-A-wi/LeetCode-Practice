package valid_palindrome

import ValidPalindromeSolution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ValidPalindromeSolutionTest {
    private val validPalindromeSolution = ValidPalindromeSolution()

    @Test
    @DisplayName("Example 1")
    fun test1() {
        Assertions.assertEquals(true, validPalindromeSolution.isPalindrome(s = "A man, a plan, a canal: Panama"))
    }

    @Test
    @DisplayName("Example 2")
    fun test2() {
        Assertions.assertEquals(false, validPalindromeSolution.isPalindrome(s = "race a car"))
    }

    @Test
    @DisplayName("Example 3")
    fun test3() {
        Assertions.assertEquals(true, validPalindromeSolution.isPalindrome(s = "  "))
    }

    @Test
    @DisplayName("Example 4")
    fun test4() {
        Assertions.assertEquals(true, validPalindromeSolution.isPalindrome(s = "a"))
    }

    @Test
    @DisplayName("Example 5")
    fun test5() {
        Assertions.assertEquals(false, validPalindromeSolution.isPalindrome(s = "0P"))
    }
}