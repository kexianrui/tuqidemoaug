package eight;

/**
 * Created by tuqi on 2018/9/20.
 */
public class InsertionSort {

    /**
     * 交换元素
     *
     * @param indexA
     * @param indexB
     * @param changeArray
     */
    private static void exchange(int indexA, int indexB, int[] changeArray) {
        int temp = changeArray[indexB];
        changeArray[indexB] = changeArray[indexA];
        changeArray[indexA] = temp;
    }

    /**
     * 交换次数较多的插入排序
     *
     * @param sortArray
     */
    private static void insertionSort(int[] sortArray) {
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (sortArray[j - 1] >= sortArray[j]) {
                    exchange(j - 1, j, sortArray);
                }
            }
        }
    }


    /**
     * 优化排序
     *
     * @param sortArray
     */
    private static void insertionSort2(int[] sortArray) {
        for (int i = 0; i < sortArray.length; i++) {
            int temp = sortArray[i];
            for (int j = i; j >= 0; j--) {
                if (j > 0 && sortArray[j-1] > temp) {
                    sortArray[j] = sortArray[j-1];
                } else {
                    sortArray[j] = temp;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] targetArray = new int[]{10, 2, 1, 16, 15, 94, 22, 11, 33};

//        insertionSort(targetArray);
        insertionSort2(targetArray);
        for (int i : targetArray) {
            System.out.println(i);
        }
    }
}
