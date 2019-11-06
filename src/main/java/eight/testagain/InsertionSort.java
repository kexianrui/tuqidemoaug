package eight.testagain;

public class InsertionSort {
    public static void sortMethod(int[] ints) {
        if (ints.length <= 1) {
            return;
        }
        for (int i = 1; i < ints.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (ints[j] > ints[j-1]) {
                    break;
                }
                int temp = ints[j-1];
                ints[j-1] = ints[j];
                ints[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] tar = new int[]{2, 3, 1, 5, 17, 3, 10};
        sortMethod(tar);
        for (int i : tar) {
            System.out.println(i);
        }
    }
}
