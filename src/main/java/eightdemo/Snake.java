package eightdemo;

import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        System.out.println("请输入蛇的维度n：");

        Scanner input = new Scanner(System.in);
        //班级数n

        int a[][] = new int[21][21];
        int i, j;
        int n = input.nextInt();

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = -1;
            }
        }

        int value = 1, max = n * n;
        i = 0;
        j = n - 1;
        int inci = 1, incj = 0;
        int nexti, nextj;
        while (value <= max) {
            a[i][j] = value++;
            //printf("i=%d, j=%d value=%d\n",i, j, value-1);
            nexti = i + inci;
            nextj = j + incj;
            if (nexti > n - 1 || nexti < 0 || nextj > n - 1 || nextj < 0 ||
                    a[nexti][nextj] != -1) {
                if (inci == 1 && incj == 0) {
                    inci = 0;
                    incj = -1;
                } else if (inci == 0 && incj == -1) {
                    inci = -1;
                    incj = 0;
                } else if (inci == -1 && incj == 0) {
                    inci = 0;
                    incj = 1;
                } else {
                    inci = 1;
                    incj = 0;
                }
                nexti = i + inci;
                nextj = j + incj;
            }
            i = nexti;
            j = nextj;
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
