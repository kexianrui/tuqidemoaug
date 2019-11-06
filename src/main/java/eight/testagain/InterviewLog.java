package eight.testagain;

import java.math.BigInteger;

public class InterviewLog {
    private static Integer calCount(int n) {
        if (n <= 1) {
            return n;
        }

        return n * calCount(n - 1);
    }

    private static int getCount(int tar) {
        int count = 0;
        for (int i = 1; i <= tar; i++) {
            count += calCount(i);
        }

        return count;
    }

    private static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return a % b == 0 ? b : GCD(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(GCD(4, 44));
    }
}
