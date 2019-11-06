package eight;

/**
 * 冒泡排序
 *
 * @author tuqi
 * @date 2018/9/25
 */
public class BubbleSort {
    private static void bubbleSort(int[] targetArray) {
        for (int i = 0; i < targetArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (targetArray[j] < targetArray[j - 1]) {
                    int temp = targetArray[j];
                    targetArray[j] = targetArray[j - 1];
                    targetArray[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] targetArray = new int[]{10, 2, 1, 16, 15, 94, 22, 11, 33};

        bubbleSort(targetArray);
        for (int i : targetArray) {
            System.out.println(i);
        }
    }
}
