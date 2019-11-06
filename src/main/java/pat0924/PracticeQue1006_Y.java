package pat0924;

import java.util.Scanner;

/**
 * Created by tuqi on 29/09/2017.
 */
public class PracticeQue1006_Y {
    private static Scanner in = new Scanner(System.in);

    public static void main(String args[]){
        int number = in.nextInt();
        if(number > 0 && number < 1000){
            int B = number / 100;
            int S = (number / 10) % 10;
            int G = number % 10;

            StringBuilder stringBuilder = new StringBuilder();
            while(B > 0){
                stringBuilder.append("B");
                B --;
            }
            while (S > 0){
                stringBuilder.append("S");
                S --;
            }
            for (int i = 1; i <= G; i++){
                stringBuilder.append(i+"");
            }

            System.out.println(stringBuilder.toString());
        }
    }

}
