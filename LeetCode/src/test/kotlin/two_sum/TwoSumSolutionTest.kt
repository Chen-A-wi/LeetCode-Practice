package two_sum

import TwoSumSolution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


class TwoSumSolutionTest {
    private val twoSumSolution = TwoSumSolution()

    @Test
    @DisplayName("Example 1")
    fun test1() {
        Assertions.assertArrayEquals(
            intArrayOf(0, 1),
            twoSumSolution.twoSum(nums = intArrayOf(2, 7, 11, 15), target = 9)
        )
    }

    @Test
    @DisplayName("Example 2")
    fun test2() {
        Assertions.assertArrayEquals(intArrayOf(1, 2), twoSumSolution.twoSum(nums = intArrayOf(3, 2, 4), target = 6))
    }

    @Test
    @DisplayName("Example 3")
    fun test3() {
        Assertions.assertArrayEquals(intArrayOf(0, 1), twoSumSolution.twoSum(nums = intArrayOf(3, 3), target = 6))
    }
}