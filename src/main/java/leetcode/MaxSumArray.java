package leetcode;

public class MaxSumArray {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i] + max;
            if (temp > max) {
                max = temp;
            } else {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Math.toIntExact(199l));
    }
}
