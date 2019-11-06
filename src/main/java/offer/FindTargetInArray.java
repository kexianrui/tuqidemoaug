package offer;

/**
 * Created by tuqi on 28/02/2018.
 */
public class FindTargetInArray {
    public static boolean Find(int target, int[][] array) {
        if (null == array) {
            return false;
        }
        int rowCount = array.length;
        int colCount = array[0].length;

        int i, j;
        for (i = rowCount-1,j=0; i>0&&j<colCount;) {
            if (array[i][j] == target) {
                return true;
            }
            if (array[i][j] > target) {
                i--;
                continue;
            }
            if (array[i][j] > target) {
                j++;
                continue;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int intArray[][] = {{1, 0}, {3, 2}, {6, 4, 5}};
        for (int[] ints : intArray) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
        System.out.println(Find(5, intArray));
    }
}
