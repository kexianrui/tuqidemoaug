package pat0924;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tuqi on 2017/10/10.
 */
public class PracticeQue1008 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int N = in.nextInt();
        int M = in.nextInt();

        if (N >= 1 && N <= 100) {
            LinkedList<Integer> initArray = new LinkedList<Integer>();
            int index = 0;
            while (index < N){
                initArray.add(in.nextInt());
                index ++;
            }
            if (N == 1) {
                StringBuilder stringBuilder = new StringBuilder();
                for (Integer integer : initArray) {
                    stringBuilder.append(integer).append(" ");
                }
                System.out.println(stringBuilder.toString().trim());
                return;
            }
            List<Integer> tempList = new ArrayList<Integer>(M);
            if (M >= 0){
                if (M <= N){
                    for (int i = N - 1; i > N - M - 1; i--){
                        tempList.add(initArray.get(i));
                        initArray.remove(i);
                    }
                } else {
                    int x = M % N;
                    if (x == 0){
                        StringBuilder stringBuilder = new StringBuilder();
                        for (Integer integer : initArray) {
                            stringBuilder.append(integer).append(" ");
                        }
                        System.out.println(stringBuilder.toString().trim());
                        return;
                    } else {
                        for (int i = N - 1; i > x - 1; i--){
                            tempList.add(initArray.get(i));
                            initArray.remove(i);
                        }
                    }
                }
            }

            for (Integer integer : tempList){
                initArray.addFirst(integer);
            }

            StringBuilder stringBuilder = new StringBuilder();
            for (Integer integer : initArray) {
                stringBuilder.append(integer).append(" ");
            }
            System.out.println(stringBuilder.toString().trim());
        }
    }
}
