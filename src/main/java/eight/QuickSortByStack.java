package eight;

import java.util.Stack;

/**
 * 栈实现快排
 *
 * @author tuqi
 * @date 2018/9/25
 */
public class QuickSortByStack {
    private static void quickSortByStack(int[] targetArray) {
        if (targetArray.length <= 0) {
            return;
        }

        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        stack.push(targetArray.length - 1);
        while (!stack.isEmpty()) {
            int high = stack.pop();
            int low = stack.pop();

            int pivotIndex = partition(targetArray, low, high);

            if (pivotIndex > low) {
                stack.push(low);
                stack.push(pivotIndex - 1);
            }

            if (pivotIndex < high && pivotIndex >= 0) {
                stack.push(pivotIndex + 1);
                stack.push(high);
            }
        }
    }

    private static int partition(int[] targetArray, int low, int high) {
        if (targetArray.length <= 0) {
            return -1;
        }

        if (low >= high) {
            return -1;
        }

        int left = low;
        int right = high;

        int pivot = targetArray[left];
        while (left < right) {
            while (left < right && targetArray[right] >= pivot) {
                right--;
            }
            targetArray[left] = targetArray[right];

            while (left < right && targetArray[left] <= pivot) {
                left++;
            }
            targetArray[right] = targetArray[left];
        }

        targetArray[left] = pivot;
        return left;
    }

    public static void main(String[] args) {
        int[] targetArray = new int[]{10, 2, 1, 16, 15, 94, 22, 11, 33};

        quickSortByStack(targetArray);
        for (int i : targetArray) {
            System.out.println(i);
        }
    }
}
