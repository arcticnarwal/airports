package longestPalindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class mainTest {

    public main cut;

    @BeforeEach
    void setup() {
        cut = new main();
    }

    @Test
    void longestPalindrome1() {
//        Input: s = "babad"
//        Output: "bab"
//        Note: "aba" is also a valid answer.
        String s = "babad";
        assertEquals("bab", cut.longestPalindrome(s));
    }

    @Test
    void longestPalindrome2() {
//        Input: s = "cbbd"
//        Output: "bb"
        String s = "cbbd";
        assertEquals("bb", cut.longestPalindrome(s));
    }

    @Test
    void longestPalindrome3() {
//        Input: s = "a"
//        Output: "a"
        String s = "a";
        assertEquals("a", cut.longestPalindrome(s));
    }

    @Test
    void longestPalindrome4() {
//        Input: s = "ac"
//        Output: "a"
        String s = "ac";
        assertEquals("a", cut.longestPalindrome(s));
    }

    @Test
    void longestPalindrome5() {
//        Input: s = "bb"
//        Output: "bb"
        String s = "bb";
        assertEquals("bb", cut.longestPalindrome(s));
    }

    @Test
    void longestPalindrome6() {
//        Input: s = "abb"
//        Output: "bb"
        String s = "abb";
        assertEquals("bb", cut.longestPalindrome(s));
    }

    @Test
    void longestPalindrome7() {
//        Input: s = "bba"
//        Output: "bb"
        String s = "bba";
        assertEquals("bb", cut.longestPalindrome(s));
    }

    @Test
    void longestPalindrome8() {
//        Input: s = "ccc"
//        Output: "ccc"
        String s = "ccc";
        assertEquals("ccc", cut.longestPalindrome(s));
    }

    @Test
    void longestPalindrome9() {
//        Input: s = "aaaa"
//        Output: "aaaa"
        String s = "aaaa";
        assertEquals("aaaa", cut.longestPalindrome(s));
    }
}