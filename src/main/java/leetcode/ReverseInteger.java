package leetcode;

public class ReverseInteger {
    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = 10 * res + x % 10;
            x = x / 10;
        }
        return (res >= Integer.MIN_VALUE && res <= Integer.MAX_VALUE) ? (int)res : 0;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-9765450));
    }
}
