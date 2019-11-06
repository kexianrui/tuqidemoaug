package leetcode;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int source = x;
        int res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        if (res == source) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        char[] chas = new char[]{1, 2, 3, 6};
        System.out.println();
    }
}
