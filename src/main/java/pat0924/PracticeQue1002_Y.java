package pat0924;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tuqi on 25/09/2017.
 */
public class PracticeQue1002_Y {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        String n = in.next();

        Pattern pattern = Pattern.compile("[\\d]");
        Matcher matcher = pattern.matcher(n);
        int count = 0;
        String result = matcher.replaceAll("");
        if(null == result || result.equals("")){
            char[] chars = n.toCharArray();
            for (char ch : chars){
                count += Integer.valueOf(String.valueOf(ch));
            }
            if (count >= 0){
                String strCount = count + "";
                char[] countChars = strCount.toCharArray();
                StringBuilder stringBuilder = new StringBuilder();
                for (char countChar : countChars){
                    switch (countChar){
                        case '0' :
                            stringBuilder.append("ling ");
                            break;
                        case '1' :
                            stringBuilder.append("yi ");
                            break;
                        case '2' :
                            stringBuilder.append("er ");
                            break;
                        case '3' :
                            stringBuilder.append("san ");
                            break;
                        case '4' :
                            stringBuilder.append("si ");
                            break;
                        case '5' :
                            stringBuilder.append("wu ");
                            break;
                        case '6' :
                            stringBuilder.append("liu ");
                            break;
                        case '7' :
                            stringBuilder.append("qi ");
                            break;
                        case '8' :
                            stringBuilder.append("ba ");
                            break;
                        case '9' :
                            stringBuilder.append("jiu ");
                            break;
                    }
                }
                String finalResult = stringBuilder.toString().trim();
                System.out.println(finalResult);
            }
        } else if(n.toCharArray().length > 100){
            System.out.println("the number is too long!");
        }
        else {
            System.out.println("the number is wrong!");
        }
    }
}
