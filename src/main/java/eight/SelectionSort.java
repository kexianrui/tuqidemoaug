package eight;

/**
 * 选择排序
 *
 * 1. 从待排序序列中获取最小值的位置
 * 2. 如果最小元素不是待排序第一个元素，将其和第一个元素交换
 * 3. 从余下的元素中找到最小元素，重复1，2步骤
 * @author tuqi
 * @date 2018/9/20
 */
public class SelectionSort {
    private static void selectionSort(int[] targetArray) {
        for (int i = 0; i < targetArray.length - 1; i++) {
            int min = i;
            for (int j = i; j < targetArray.length; j++) {
                if (targetArray[j] < targetArray[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = targetArray[min];
                targetArray[min] = targetArray[i];
                targetArray[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] targetArray = new int[]{10, 2, 1, 16, 15, 94, 22, 11, 33};

//        insertionSort(targetArray);
        selectionSort(targetArray);
        for (int i : targetArray) {
            System.out.println(i);
        }
    }
}
