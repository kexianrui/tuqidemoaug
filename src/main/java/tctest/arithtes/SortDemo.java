package tctest.arithtes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class SortDemo {
    public static void maopaoSort(int[] ints) throws IllegalAccessException {
        int length = ints.length;
        if (length <= 0) {
            throw new IllegalAccessException("传入的参数有误，数组内无参数！");
        }

        if (length == 1) {
            return;
        }

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (ints[i] < ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
    }

    public static int binarySearch(List<Integer> sortedList, Integer targetInt) throws IllegalAccessException {
        int size = sortedList.size();
        if (size <= 0 || targetInt == null) {
            throw new IllegalAccessException("传入参数有误！");
        }
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            Integer midVal = sortedList.get(mid);

            if (midVal > targetInt) {
                high = mid - 1;
            } else if (midVal < targetInt) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    {
        synchronized (this) {

        }
    }

    public static void main(String[] args) throws IllegalAccessException {
//        int[] ins = new int[]{10, 1, 9, 2, 18, 4, 3};
//        int[] ins = new int[]{};
//        int[] ins = new int[]{10};
//        maopaoSort(ins);
//        for (int in : ins) {
//            System.out.println(in);
//        }

        // 二分法测试
//        List<Integer> integers = Arrays.asList(1, 2, 4, 6, 7, 9, 10, 29, 33, 41, 50, 100);
//        int i = binarySearch(integers, 29);
//        System.out.println(i);

        TreeMap<String, Object> treeMap = new TreeMap<>();
        treeMap.put("b", null);
        treeMap.put("V", null);
        treeMap.put("a", null);
        System.out.println(treeMap);
//        System.out.println(3&7);
    }
}
