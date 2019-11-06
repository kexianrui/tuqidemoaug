package pat0924;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tuqi on 2017/10/17.
 */
public class PracticeQue1012 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> checkQueue = new ArrayList<Integer>();
        checkQueue.add(in.nextInt());

        List<Integer> A1 = new ArrayList<Integer>();
        List<Integer> A2 = new ArrayList<Integer>();
        List<Integer> A3 = new ArrayList<Integer>();
        List<Integer> A4 = new ArrayList<Integer>();
        List<Integer> A5 = new ArrayList<Integer>();
        for (Integer item : checkQueue){
            int res = item % 5;
            switch (res){
                case 0:
                    if (item % 2 == 0){
                        A1.add(item);
                    }
                    break;
                case 1:
                    A2.add(item);
                    break;
                case 2:
                    A3.add(item);
                    break;
                case 3:
                    A4.add(item);
                    break;
                case 4:
                    A5.add(item);
                    break;
            }
        }
        String a1 = "";
        String a2 = "";
        String a3 = "";
        String a4 = "";
        String a5 = "";
        if(A1.isEmpty()){
            a1 = "N";
        }else {
            for (Integer item : A1){
                if(item % 2 == 0){
                    a1 += item;
                }
            }
        }

        if(A2.isEmpty()){
            a2 = "N";
        }else {
            for (int i = 0; i < A2.size(); i++){
                if (i % 2 == 0){

                }
            }
        }
        if(A3.isEmpty()){
            a3 = "N";
        }else {
            a3 = A3.size() + "";
        }
        if(A4.isEmpty()){
            a4 = "N";
        }else {
            int total = 0;
            for (Integer item : A4){
                total += item;
            }
            a4 = (Long.valueOf(total) / A4.size()) + "";
        }
        if(A5.isEmpty()){
            a5 = "N";
        }else {
            for (Integer item : A5){
                int max = A5.get(0);
                if (item > max){
                    max = item;
                }
            }
        }

        System.out.print(a1 + a2 + a3 + a4 + a5);
    }
}
