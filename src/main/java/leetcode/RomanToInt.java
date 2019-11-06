package leetcode;

import java.util.*;

public class RomanToInt {
    public static int romanToInt(String s) {
        // 创建罗马数对应的十进制数值（设置桶大小和负载因子，节省空间）
        HashMap<Character, Integer> staticMap = new HashMap<>(8, 1);
        staticMap.put('I', 1);
        staticMap.put('V', 5);
        staticMap.put('X', 10);
        staticMap.put('L', 50);
        staticMap.put('C', 100);
        staticMap.put('D', 500);
        staticMap.put('M', 1000);
        // 字符串转字节类型匹配数值
        char[] romans = s.toCharArray();
        int temp = 0;
        int res = 0;
        for (int i = romans.length-1; i >= 0; i--) {
            int cur = staticMap.get(romans[i]);
            res = cur < temp ? res - cur : res + cur;
            temp = cur;
        }

        return res;
    }

    public static void main(String[] args) {

        System.out.println("");
    }
}
