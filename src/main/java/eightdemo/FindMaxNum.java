package eightdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindMaxNum {

    public static Map getMap(String targetStr) {
        Map<Character, Integer> tarMap = new TreeMap<>();

        char[] chars = targetStr.toCharArray();
        for (char item : chars) {
            if (item == ' ') {
                continue;
            } else if (tarMap.containsKey(item)) {
                tarMap.put(item, Integer.sum(tarMap.get(item), 1));
            } else {
                tarMap.put(item, 1);
            }
        }

        return tarMap;
    }

    public static Character getMax(Map<Character, Integer> map) {
        Character res = null;
        int max = 1;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        String str = "hello world ee";
        String str = "hel";
        Map map = getMap(str);
        Character max = getMax(map);
        if (max == null) {
            System.out.println("Error");
        } else {
            System.out.println(max);
        }
    }
}
