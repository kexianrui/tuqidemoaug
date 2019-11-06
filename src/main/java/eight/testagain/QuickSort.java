package eight.testagain;

public class QuickSort {
    public static void quickSort(int[] ints, int low, int high) {
        int len = ints.length;
        if (len <= 0 || low >= high){
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

    public static void main(String[] args) throws IllegalAccessException {
        int[] targetArray = new int[]{10, 2, 1, 16, 2, 1, 15, 94, 33, 22, 11, 33};

        quickSort(targetArray, 0, targetArray.length - 1);
        for (int i : targetArray) {
            System.out.println(i);
        }
    }
}
