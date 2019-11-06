package pat0924;

import java.util.Scanner;

/**
 * Created by tuqi on 24/09/2017.
 */
public class PracticeQue1001_Y {
    private static Scanner in = new Scanner(System.in);
    private static int res = 0;

    public static void main(String[] args) {
        int n = in.nextInt();

        if (n > 0 && n <= 1000) {
            //如果是1的话，我们直接输出0
            if (n == 1) {
                System.out.println(0);
            } else {
                //调用递归，计算出步数
                returnCurNumber(n);
                System.out.println(res);
            }
        }
    }

    private static int returnCurNumber(int number) {
        if (number % 2 == 0) {
            //偶数
            number = (number / 2);
            res++;
        } else {
            //奇数
            number = (number * 3 + 1) / 2;
            res++;
        }

        if (number == 1) {
            return res;
        }
        return returnCurNumber(number);
    }
}
