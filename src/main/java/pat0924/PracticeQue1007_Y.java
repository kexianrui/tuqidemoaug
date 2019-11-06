package pat0924;

import java.util.Scanner;

/**
 * Created by tuqi on 08/10/2017.
 */
public class PracticeQue1007_Y {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int number = in.nextInt();
        int result = 0;
        for (int i = 1; i < number; i++) {
            if (isPrimeNumber(i)) {
                int temp = i + 2;
                if (temp <= number && isPrimeNumber(temp)) {
                    result ++;
                }
            }
        }
        System.out.println(result);
    }

    public static boolean isPrimeNumber(int number) {
        if (number > 1) {
            int sqrtNum = (int) Math.sqrt(number);
            for (int i = 2; i < sqrtNum + 1; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
