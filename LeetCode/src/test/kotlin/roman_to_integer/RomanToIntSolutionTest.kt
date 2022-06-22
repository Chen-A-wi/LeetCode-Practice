package roman_to_integer

import RomanToIntSolution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class RomanToIntSolutionTest {
    private val romanToIntSolution = RomanToIntSolution()

    @Test
    @DisplayName("Example 1")
    fun test1() {
        Assertions.assertEquals(3, romanToIntSolution.romanToInt(s = "III"))
    }

    @Test
    @DisplayName("Example 2")
    fun test2() {
        Assertions.assertEquals(58, romanToIntSolution.romanToInt(s = "LVIII"))
    }

    @Test
    @DisplayName("Example 3")
    fun test3() {
        Assertions.assertEquals(1994, romanToIntSolution.romanToInt(s = "MCMXCIV"))
    }
}