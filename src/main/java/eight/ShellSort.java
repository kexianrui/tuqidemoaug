package eight;

import java.util.Random;

/**
 * Created by tuqi on 2018/9/20.
 */
public class ShellSort {
    private static void shellSort(int[] targetArray){
        int gap = 1;
        int i = 0;
        int j = 0;
        int length = targetArray.length;
        int temp = 0;

        // 获取第一个合适的步长
        while (gap < length / 3) {
            gap = gap * 3 + 1;
        }
        // 步长递减
        for (; gap > 0; gap /= 3) {
            for (i = gap; i < length; i++) {
                temp = targetArray[i];
                for (j = i - gap; j >= 0 && targetArray[j] > temp; j -= gap) {
                    targetArray[j + gap] = targetArray[j];
                }
                targetArray[j + gap] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] targetArray = new int[]{10, 2, 1, 16, 15, 94, 22, 11, 33};

        Random random = new Random();
        int[] tempArray = new int[100000];
        for (int s = 0; s < 100000; s ++) {
            tempArray[s] = random.nextInt(1000000);
        }

//        insertionSort(targetArray);
        shellSort(tempArray);
        for (int i : tempArray) {
            System.out.println(i);
        }
    }
}
