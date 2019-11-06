package eight;

/**
 * Created by tuqi on 2018/9/21.
 */
public class HeapSort {
    private static void heapSort(int[] targetArray) {
        for (int i = targetArray.length; i > 0; i--) {
            maxHeapy(targetArray, i);

            int temp = targetArray[0];
            targetArray[0] = targetArray[i-1];
            targetArray[i-1] = temp;
        }
    }

    private static void maxHeapy(int[] targetArray, int limit) {
        if (targetArray.length <= 0 || targetArray.length < limit) {
            return;
        }

        int parentIndex = limit / 2;
        for (; parentIndex >= 0; parentIndex--){
            //
            if (parentIndex * 2 >= limit) {
                continue;
            }

            // 获取左节点
            int left = parentIndex * 2;
            // 获取右节点
            int right = (left + 1) >= limit ? left : (left + 1);

            // 获取当前序列中最大的节点
            int maxChildIndex = targetArray[left] > targetArray[right] ? left : right;
            // 交换最大值位置
            if (targetArray[maxChildIndex] > targetArray[parentIndex]) {
                int temp = targetArray[parentIndex];
                targetArray[parentIndex] = targetArray[maxChildIndex];
                targetArray[maxChildIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] targetArray = new int[]{10, 2, 1, 16, 15, 94, 22, 11, 33};

        heapSort(targetArray);
        for (int i : targetArray) {
            System.out.println(i);
        }
    }
}
