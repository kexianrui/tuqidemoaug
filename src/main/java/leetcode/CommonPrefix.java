package leetcode;

import eightdemo.InterfaceDemo;

import java.util.UUID;

public class CommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) {
            return "";
        }
        int idx = 0;
        String fir = strs[0];
        for (int i = 0; i < fir.length() ; i++) {
            char cur = fir.charAt(idx);
            for (int j = 1; j <= len-1; j++) {
                if (strs[j].length() == i || cur != strs[j].charAt(idx)) {
                    return strs[j].substring(0, idx);
                }
            }
            idx ++;
        }

        return fir.substring(0, idx);
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"c","c"}));
    }
}
