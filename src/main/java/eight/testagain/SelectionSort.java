package eight.testagain;

public class SelectionSort {
    private static void sortMethod(int[] ints) {
        if (ints.length <= 1) {
            return;
        }
        for (int i = 0; i < ints.length-1; i++) {
            int min = i;
            for (int j = i+1; j < ints.length; j++) {
                if (ints[j] < ints[min]){
                    min = j;
                }
            }
            if (min != i) {
                int temp = ints[min];
                ints[min] = ints[i];
                ints[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] tar = new int[]{99, 2, 3, 1, 5, 17, 3, 10};
        sortMethod(tar);
        for (int i : tar) {
            System.out.println(i);
        }
    }
}
