package pat0924;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tuqi on 26/09/2017.
 */
public class PracticeQue1003 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int totalNumber = in.nextInt();
        if (totalNumber < 10) {
            List<String> checkList = new ArrayList<String>(totalNumber);
            while (totalNumber > 0) {
                checkList.add(in.next());
                totalNumber--;
            }
            Pattern pattern = Pattern.compile("[^PAT\\s]");
            if (checkList.size() > 0) {
                for (String item : checkList) {
                    if (item.length() < 3) {
                        System.out.println("NO");
                        continue;
                    }
                    if (null != item && !item.equals("")) {
                        if ((item.length() <= 100) && (item.trim().length() == item.length())) {
                            Matcher matcher = pattern.matcher(item);
                            if (matcher.find()) {
                                System.out.println("NO");
                            } else {
                                char[] itemChars = item.toCharArray();
                                int pTail = 0;
                                int pTag = 0;
                                int tTail = 0;
                                int tTag = 0;
                                for (int i = 0; i < itemChars.length; i ++){
                                    if (itemChars[i] == 'P'){
                                        pTag = i;
                                    }
                                    if (itemChars[i] == 'T'){
                                        tTag = i;
                                    }
                                }
                                for(int i = 0; i < itemChars.length; i ++){
                                    if (i < tTag && i > pTag){
                                        pTail ++;
                                    }
                                    if(i > tTag){
                                        tTail ++;
                                    }
                                }
                                if (pTag == 0 && tTag == item.length() -1){
                                    System.out.println("YES");
                                    continue;
                                }
                                if(tTail >= pTail){
                                    System.out.println("YES");
                                } else {
                                    System.out.println("NO");
                                }
                            }
                        } else {
                            System.out.println("the string is wrong");
                        }
                    }
                }
            }
        } else {
            System.out.println("too much data!");
        }
    }
}
