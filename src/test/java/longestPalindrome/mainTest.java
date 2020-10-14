package longestPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    void longestPalindrome1() {
//        Input: s = "babad"
//        Output: "bab"
//        Note: "aba" is also a valid answer.
        String s = "babad";
        assertEquals("bab", main.longestPalindrome(s));
    }

    @Test
    void longestPalindrome2() {
//        Input: s = "cbbd"
//        Output: "bb"
        String s = "cbbd";
        assertEquals("bb", main.longestPalindrome(s));
    }

    @Test
    void longestPalindrome3() {
//        Input: s = "a"
//        Output: "a"
        String s = "a";
        assertEquals("a", main.longestPalindrome(s));
    }

    @Test
    void longestPalindrome4() {
//        Input: s = "ac"
//        Output: "a"
        String s = "ac";
        assertEquals("a", main.longestPalindrome(s));
    }

    @Test
    void longestPalindrome5() {
//        Input: s = "bb"
//        Output: "bb"
        String s = "bb";
        assertEquals("bb", main.longestPalindrome(s));
    }

    @Test
    void longestPalindrome6() {
//        Input: s = "abb"
//        Output: "bb"
        String s = "abb";
        assertEquals("bb", main.longestPalindrome(s));
    }

    @Test
    void longestPalindrome7() {
//        Input: s = "bba"
//        Output: "bb"
        String s = "bba";
        assertEquals("bb", main.longestPalindrome(s));
    }

    @Test
    void longestPalindrome8() {
//        Input: s = "ccc"
//        Output: "ccc"
        String s = "ccc";
        assertEquals("ccc", main.longestPalindrome(s));
    }

    @Test
    void longestPalindrome9() {
//        Input: s = "aaaa"
//        Output: "aaaa"
        String s = "aaaa";
        assertEquals("aaaa", main.longestPalindrome(s));
    }
}