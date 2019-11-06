package eight;

import java.util.Arrays;

/**
 * 递归方法实现快排
 *
 * @author tuqi
 * @date 2018/9/25
 */
public class QuickSort {
    private static void quickSort(int[] targetArray, int low, int high) {
        if (targetArray.length <= 0) {
            return;
        }

        if (low > high) {
            return;
        }

        int left = low;
        int right = high;

        // 基准的值
        int temp = targetArray[left];
        while (left < right) {
            // 从后向前查找比基准小的值，插入到基准的左边
            while (left < right && targetArray[right] >= temp) {
                right--;
            }
            targetArray[left] = targetArray[right];

            // 从前往后查找比基准大的值，插入到基准的右边
            while (left < right && targetArray[left] <= temp) {
                left++;
            }

            targetArray[right] = targetArray[left];
        }
        // 基准
        targetArray[left] = temp;

        quickSort(targetArray, low, left - 1);
        quickSort(targetArray, left + 1, high);
    }

    public static void main(String[] args) {
        int[] targetArray = new int[]{10, 2, 1, 16, 15, 94, 22, 11, 33};

        quickSort(targetArray, 0, targetArray.length - 1);
        for (int i : targetArray) {
            System.out.println(i);
        }
    }
}
