package longestPalindrome;

public class main {

    public main() {
    }

    public String longestPalindrome(String s) {
        String longestP = "";
        for (int i = 0; i < s.length(); ++i) {
            String p = expandAround(s, i, false);
            if (p.length() > longestP.length()) {
                longestP = p;
            }
            p = expandAround(s, i, true);
            if (p.length() > longestP.length()) {
                longestP = p;
            }
        }
        return longestP;
    }

    private String expandAround(String s, int i, boolean isEven) {
        int start = i;
        int end = isEven ? i + 1 : i;
        while (start >= 0 && end < s.length()) {
            if (s.charAt(start) == s.charAt(end)) {
                --start;
                ++end;
            } else {
                break;
            }
        }
        if (start < i) {
            ++start;
        }

        return s.substring(start, end);
    }
}
