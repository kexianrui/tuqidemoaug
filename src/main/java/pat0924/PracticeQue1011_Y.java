package pat0924;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tuqi on 2017/10/17.
 */
public class PracticeQue1011_Y {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        long num = Integer.parseInt(in.nextLine());
        if (num <= 10){
            List<String> checkQue = new ArrayList<String>();
            while (num > 0){
                checkQue.add(in.nextLine());
                num --;
            }
            int index = 1;
            for (String item : checkQue){
                String res = checkValue(item);
                System.out.println("Case #"+ index +": " + res);
                index ++;
            }
        }
    }

    private static String checkValue(String checkValue){
        String[] values = checkValue.split(" ");
        long result = Long.valueOf(values[0]) + Long.valueOf(values[1]);
        if(result > Long.valueOf(values[2])){
            return "true";
        }
        return "false";
    }
}
