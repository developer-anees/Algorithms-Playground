package leetcode.problem_0459;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();
    private final Solution_2 otherSolution = new Solution_2();

    @Test
    public void repeatedSubstringPattern_1() throws Exception {
        final String input = "abab";

        final boolean result = solution.repeatedSubstringPattern(input);
        final boolean otherResult = otherSolution.repeatedSubstringPattern(input);

        assertTrue(result);
        assertTrue(otherResult);
    }

    @Test
    public void repeatedSubstringPattern_2() throws Exception {
        final String input = "aba";

        final boolean result = solution.repeatedSubstringPattern(input);
        final boolean otherResult = otherSolution.repeatedSubstringPattern(input);

        assertFalse(result);
        assertFalse(otherResult);
    }

    @Test
    public void repeatedSubstringPattern_3() throws Exception {
        final String input = "abcabcabcabc";

        final boolean result = solution.repeatedSubstringPattern(input);
        final boolean otherResult = otherSolution.repeatedSubstringPattern(input);

        assertTrue(result);
        assertTrue(otherResult);
    }

    @Test
    public void repeatedSubstringPattern_4() throws Exception {
        final String input = "a";

        final boolean result = solution.repeatedSubstringPattern(input);
        final boolean otherResult = otherSolution.repeatedSubstringPattern(input);

        assertFalse(result);
        assertFalse(otherResult);
    }

    @Test
    public void repeatedSubstringPattern_5() throws Exception {
        final String input = "";

        final boolean result = solution.repeatedSubstringPattern(input);
        final boolean otherResult = otherSolution.repeatedSubstringPattern(input);

        assertFalse(result);
        assertFalse(otherResult);
    }

    @Test
    public void repeatedSubstringPattern_6() throws Exception {
        final String input = null;

        final boolean result = solution.repeatedSubstringPattern(input);
        final boolean otherResult = otherSolution.repeatedSubstringPattern(input);

        assertFalse(result);
        assertFalse(otherResult);
    }
}