package palindrome_number

import PalindromeNumberSolution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class PalindromeNumberSolutionTest {
    private val palindromeNumberSolution = PalindromeNumberSolution()

    @Test
    @DisplayName("Example 1")
    fun test1() {
        Assertions.assertTrue(palindromeNumberSolution.isPalindrome(x = 121))
    }

    @Test
    @DisplayName("Example 2")
    fun test2() {
        Assertions.assertFalse(palindromeNumberSolution.isPalindrome(x = -121))
    }

    @Test
    @DisplayName("Example 3")
    fun test3() {
        Assertions.assertFalse(palindromeNumberSolution.isPalindrome(x = 10))
    }

    @Test
    @DisplayName("Example 4")
    fun test4() {
        Assertions.assertTrue(palindromeNumberSolution.isPalindrome(x = 0))
    }
}