package eight.testagain;

public class HeapSort {
    private static void heapSort(int[] ints) {
        int i = ints.length;
        for (; i > 0; i--) {
            maxHeapSort(ints, i);

            int temp = ints[0];
            ints[0] = ints[i-1];
            ints[i-1] = temp;
        }
    }

    private static void maxHeapSort(int[] ints, int limit) {
        int len = ints.length;
        if (len <= 0 || len < limit) {
            return;
        }

        int pIdx = limit >> 1;
        for (; pIdx >= 0; pIdx--) {
            int left = pIdx << 1;
            if (left >= limit) {
                continue;
            }
            int right = (left+1) >= limit ? left : left+1;

            int chMaxIdx = ints[left] > ints[right] ? left : right;
            if (ints[chMaxIdx] > ints[pIdx]) {
                int temp = ints[pIdx];
                ints[pIdx] = ints[chMaxIdx];
                ints[chMaxIdx] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[] targetArray = new int[]{10, 2, 1, 16, 2, 1, 15, 94, 33, 22, 11, 33};

        heapSort(targetArray);
        for (int i : targetArray) {
            System.out.println(i);
        }
    }
}
