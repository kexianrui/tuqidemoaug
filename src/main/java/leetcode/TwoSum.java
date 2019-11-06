package leetcode;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int expect = target - nums[i];
            for (int j = nums.length-1; j > i; j--) {
                if (nums[j] == expect) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int[] res = twoSum(nums, 6);
        for (int re : res) {
            System.out.println(re);
        }
    }
}