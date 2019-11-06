package pat0924;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tuqi on 27/09/2017.
 */
public class PracticeQue1004 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int totalDataNum = Integer.valueOf(in.nextLine());
        if (totalDataNum > 1) {
            List<String> dataList = new ArrayList<String>(totalDataNum);
            List<String> infoList = new ArrayList<String>(totalDataNum);
            List<Integer> scoreList = new ArrayList<Integer>(totalDataNum);

            for (int i = 0; i < totalDataNum; i++) {
                dataList.add(in.nextLine());
            }
            for (String item : dataList) {
                String[] itemStrs = item.split(" ");
                if (itemStrs[0].length() <= 10 && itemStrs[1].length() <= 10) {
                    infoList.add(itemStrs[0] + " " + itemStrs[1]);
                } else {
                    System.out.println("data too long!");
                    break;
                }
                Integer score = Integer.valueOf(itemStrs[2]);
                Pattern pattern = Pattern.compile("[.]");
                if (score >= 0 && score <= 100) {
                    Matcher matcher = pattern.matcher(score.toString());
                    if (matcher.find()) {
                        System.out.println("score is not a int!");
                        break;
                    } else {
                        scoreList.add(score);
                    }
                } else {
                    System.out.println("score out of range!");
                    break;
                }
            }
            int max = Collections.max(scoreList);
            int min = Collections.min(scoreList);

            for (int i = 0; i < scoreList.size(); i++) {
                if (max == scoreList.get(i)) {
                    System.out.println(infoList.get(i));
                }
            }
            for (int i = 0; i < scoreList.size(); i++) {
                if (min == scoreList.get(i)) {
                    System.out.println(infoList.get(i));
                }
            }
        } else {
            System.out.println("total data num limit 2");
        }
    }
}
