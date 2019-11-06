package eight.test;

public class BinarySearch {
    public static int binarySea(int[] ints, int tar) {
        int len = ints.length;
        if (len <= 0) {
            return -1;
        }
        int left = 0;
        int right = len-1;

        while (left < right) {
            int mid = (left + right) >> 1;
            if (ints[mid] > tar) {
                right = mid -1;
            } else if (ints[mid] < tar) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static void quickSort(int[] ints, int low, int high) {
        int len = ints.length;
        if (len <= 1 || low >= high) {
            return;
        }
        int left = low;
        int right = high;
        int flag = ints[left];
        while (left < right) {
            while (left < right && ints[right] >= flag) {
                right --;
            }
            ints[left] = ints[right];
            while (left < right && ints[left] <= flag) {
                left ++;
            }
            ints[right] = ints[left];
        }
        ints[left] = flag;
        quickSort(ints, low, left - 1);
        quickSort(ints, left + 1, high);
    }

    public static void heapify(int[] ints, int limit) {
        int len = ints.length;
        if (len <= 0 || len < limit) {
            return;
        }
        int parnIndex = limit >> 1;
        for (; parnIndex >= 0; parnIndex--) {
            if (parnIndex << 1 >= limit) {
                continue;
            }
            int left = parnIndex << 1;
            int right = (left+1) >= limit ? left : left+1;
            int maxChildIdx = ints[left] >= ints[right] ? left : right;
            if (ints[maxChildIdx] > ints[parnIndex]) {
                int temp = ints[parnIndex];
                ints[parnIndex] = ints[maxChildIdx];
                ints[maxChildIdx] = temp;
            }
        }
    }

    public static void heapSort(int[] ints) {
        for (int i = ints.length; i > 0; i--) {
            heapify(ints, i);

            int temp = ints[0];
            ints[0] = ints[i-1];
            ints[i-1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] targetArray = new int[]{10, 4, 2, 1, 16, 15, 94, 22, 11, 33};

//        quickSort(targetArray, 0, targetArray.length - 1);
        heapSort(targetArray);
        for (int i : targetArray) {
            System.out.println(i);
        }
        System.out.println(binarySea(targetArray, 33));
    }
}
