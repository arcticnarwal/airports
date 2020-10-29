package regularExpressionMatching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    public main cut;

    @BeforeEach
    void setup() {
        cut = new main();
    }

    @Test
    void isMatch() {
        //    Input: s = "aa", p = "a"
        //    Output: false
        //    Explanation: "a" does not match the entire string "aa".
        String s = "aa",
                p = "a";

        assertFalse(cut.isMatch(s, p));
    }

    @Test
    void isMatch2() {
        //    Input: s = "aa", p = "a*"
        //    Output: true
        //    Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
        String s = "aa",
                p = "a*";

        assertTrue(cut.isMatch(s, p));
    }

    @Test
    void isMatch3() {
        //    Input: s = "ab", p = ".*"
        //    Output: true
        //    Explanation: ".*" means "zero or more (*) of any character (.)".
        String s = "ab",
                p = ".*";

        assertTrue(cut.isMatch(s, p));
    }

    @Test
    void isMatch4() {
        //    Input: s = "aab", p = "c*a*b"
        //    Output: true
        //    Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore, it matches "aab".
        String s = "aab",
                p = "c*a*b";

        assertTrue(cut.isMatch(s, p));
    }

    @Test
    void isMatch5() {
        //    Input: s = "mississippi", p = "mis*is*p*."
        //    Output: false
        String s = "mississippi",
                p = "mis*is*p*.";

        assertTrue(cut.isMatch(s, p));
    }

    @Test
    void isMatch6() {
        String s = "mississippi",
                p = "mi.*p.";

        assertTrue(cut.isMatch(s, p));
    }

}