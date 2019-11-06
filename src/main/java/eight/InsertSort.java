package eight;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package eight
 * @author: tuqi（tuqi@maihaoche.com）
 * @date: 2018/8/13 下午4:13
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：
 */
public class InsertSort {
    /**
     * 原始方法
     *
     * @param targetArray
     * @return
     */
    public static int[] insertSort(int[] targetArray) {
        if (null != targetArray && targetArray.length > 1) {
            for (int i = 0; i < targetArray.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (targetArray[j] < targetArray[j - 1]) {
                        exchange(targetArray, j, j - 1);
                    }
                }
            }
        }
        return targetArray;
    }

    /**
     * 数据交换
     *
     * @param array
     * @param i
     * @param j
     */
    private static void exchange(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * 将最小值移到最左边
     *
     * @param array
     */
    private static void moveMinLeft(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        exchange(array, 0, minIndex);
    }

    /**
     * 先将最小值移至最左边，减少判断条件
     *
     * @param array
     */
    public static void moveMinSort(int[] array) {
        moveMinLeft(array);
        for (int i = 1; i < array.length; i++) {
            for (int j = i; array[j] < array[j - 1]; j--) {
                exchange(array, j, j - 1);
            }
        }
    }

    /**
     * 优化插入排序，减少插入次数
     *
     * @param array
     */
    private static void reduceMoveNum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = i;
            int temp = array[i];
            while (j > 0 && temp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }

    /**
     * 二分法
     *
     * @param array
     * @param low
     * @param high
     * @param target
     */
    private static int binaryArrayIndex(int[] array, int low, int high, int target) {
        int midIndex;
        while (low <= high) {
            midIndex = (low + high) / 2;
            if (target < array[midIndex]) {
                high = midIndex - 1;
            } else {
                low = midIndex + 1;
            }
        }
        return low;
    }

    /**
     * 二分法插入排序
     *
     * @param array
     */
    private static void binaryInsertSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int low = binaryArrayIndex(array, 0, i - 1, temp);
            for (int j = i; j > low; j--) {
                array[j] = array[j - 1];
            }
            array[low] = temp;
        }
    }

    private static void shellSort(int[] array) {
        int gap = 1;
        while(gap < array.length) {
            gap = gap * 3 + 1;
        }

        while(gap > 0) {
            for (int i = 1; i < array.length; i++) {
                int temp = array[i];
                int j = i;
                while (j < gap-1 && array[j-gap] > temp) {

                }
            }
        }
    }


    public static void main(String[] args) {
        int[] targetArray = new int[]{10, 2, 1, 16, 15, 94, 22, 11, 33};
//        insertSort(targetArray);
//        reduceMoveNum(targetArray);
//        binaryInsertSort(targetArray);
        shellSort(targetArray);
        for (int i : targetArray) {
            System.out.println(i);
        }
    }
}
