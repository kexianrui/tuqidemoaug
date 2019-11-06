package pat0924;

import java.util.Scanner;

/**
 * Created by tuqi on 2017/10/11.
 */
public class PracticeQue1009_Y {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String sentence = in.nextLine();
        if (sentence.length() <= 80){
            String[] sentences = sentence.split(" ");
            for (int i = sentences.length - 1; i >= 0; i--){
                System.out.print(sentences[i]);
                if (i > 0){
                    System.out.print(" ");
                }
            }
        }
    }
}
