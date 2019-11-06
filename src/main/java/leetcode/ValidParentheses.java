package leetcode;

import java.util.HashSet;
import java.util.Map;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] lch = new char[]{'{', '[', '('};
        char[] rch = new char[]{'}', ']', ')'};
        if (null == s) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
