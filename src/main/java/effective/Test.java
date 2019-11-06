package effective;

import eightdemo.dao.Shop;

import java.text.NumberFormat;
import java.util.*;

/**
 * Created by tuqi on 26/02/2018.
 */
public class Test {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                int temp = 0 - nums[i] - nums[j];

            }
        }
        return null;
    }

    public static int numJewelsInStones(String J, String S) {
        int amount = 0;
        if (J.length() == 0 || S.length() == 0) {
            return amount;
        }

        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j)) {
                    amount++;
                }
            }
        }
        return amount;
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public static int[] sortArrayByParity(int[] A) {
        int lidx = 0;
        int ridx = A.length - 1;
        while (lidx < ridx) {
            if (A[lidx] % 2 != 0) {
                int temp = A[lidx];
                A[lidx] = A[ridx];
                A[ridx] = temp;
                ridx--;
            } else {
                lidx++;
            }
        }

        return A;
    }

    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char item : moves.toCharArray()) {
            switch (item) {
                case 'U':
                    y += 1;
                    break;
                case 'D':
                    y += -1;
                    break;
                case 'L':
                    x += -1;
                    break;
                case 'R':
                    x += 1;
                    break;
            }
        }

        if (x == 0 && y == 0) {
            return true;
        }
        return false;
    }

    public static HashSet uniqueMorseRepresentations(String[] words) {
        String[] MORSE = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        HashSet<String> result = new HashSet<>();
        for (String str : words) {
            StringBuilder item = new StringBuilder();
            for (char ch : str.toCharArray()) {
                item.append(MORSE[ch - 'a']);
            }

            result.add(item.toString());
        }

        return result;
    }

    public static int hammingDistance(int x, int y) {
        int result = 0;
        while (x == 0 || y == 0) {
            x = x >> 1;
            y = y >> 1;
            if (x >> 1 != y >> 1) {
                result++;
            }
        }
        return result;
    }

    public int[][] flipAndInvertImage(int[][] A) {
        int l = A.length;
        int index = 0;
        int[][] result = new int[l][l];
        for (int[] item : A) {
            int position = 0;
            for (int j = l - 1; j >= 0; j--) {
                result[index][position] = item[j] == 0 ? 1 : 0;
                position ++;
            }
            index ++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] targetArray = new int[]{-1, 0, 1, 2, -1, -4};

        int[] targetArray1 = new int[]{3, 1, 1, 2, -1, 4};

        String[] words = {"gin", "zen", "gig", "msg"};

        long startTime = System.currentTimeMillis();
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        String format = percentInstance.format(0.15);
//        System.out.println(format);

//        System.out.println("使用时间：" + (System.currentTimeMillis() - startTime) + " ms");
    }
}
