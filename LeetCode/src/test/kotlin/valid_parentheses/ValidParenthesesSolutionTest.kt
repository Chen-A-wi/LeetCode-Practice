package valid_parentheses

import ValidParenthesesSolution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ValidParenthesesSolutionTest {
    private val validParenthesesSolution = ValidParenthesesSolution()

    @Test
    @DisplayName("Example 1")
    fun test1() {
        Assertions.assertTrue(validParenthesesSolution.isValid(s = "()"))
    }

    @Test
    @DisplayName("Example 2")
    fun test2() {
        Assertions.assertTrue(validParenthesesSolution.isValid(s = "()[]{}"))
    }

    @Test
    @DisplayName("Example 3")
    fun test3() {
        Assertions.assertFalse(validParenthesesSolution.isValid(s = "(]"))
    }

    @Test
    @DisplayName("Example 4")
    fun test4() {
        Assertions.assertTrue(validParenthesesSolution.isValid(s = "{[]}"))
    }

    @Test
    @DisplayName("Example 5")
    fun test5() {
        Assertions.assertFalse(validParenthesesSolution.isValid(s = "([)]"))
    }

    @Test
    @DisplayName("Example 6")
    fun test6() {
        Assertions.assertFalse(validParenthesesSolution.isValid(s = "(){}}{"))
    }

    @Test
    @DisplayName("Example 7")
    fun test7() {
        Assertions.assertTrue(validParenthesesSolution.isValid(s = "(([]{}){})"))
    }
}