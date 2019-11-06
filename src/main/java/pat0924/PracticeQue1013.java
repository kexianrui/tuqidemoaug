package pat0924;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tuqi on 2017/10/18.
 *
 * PAT官网运行超时
 */
public class PracticeQue1013 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int start = in.nextInt();
        int end = in.nextInt();

        if(end <= 10000 && start <= end){
            int size = end - start;
            int index = 0;
            List<Integer> numList = new ArrayList<Integer>();
            for (int i = 2; i <= 10000; i++){
                if (isPrimeNumber(i)){
                    index ++;
                    if (index >= start){
                        numList.add(i);
                        size --;
                        if (size < 0){
                            break;
                        }
                    }
                }
            }

            for (int i = 1; i <= numList.size(); i++){
                if (i > 0 && i % 10 == 0){
                    System.out.println(numList.get(i-1));
                } else {
                    System.out.print(numList.get(i-1) + " ");
                }
            }
        }
    }

    private static boolean isPrimeNumber(Integer number){
        if (number > 1){
            int sqrtNum = (int) Math.sqrt(number);
            for (int i = 2; i < sqrtNum + 1; i++){
                if (number % i == 0){
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
