package pat0924;

import java.util.*;

/**
 * Created by tuqi on 27/09/2017.
 */
public class PracticeQue1005_Y {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // receive input number
        int n = in.nextInt();
        LinkedList<Integer> checkNums = new LinkedList<Integer>();
        for (int i = 0; i < n; i++){
            checkNums.add(in.nextInt());
        }

        Set<Integer> ignoreList = new HashSet<Integer>();
        for (Integer item : checkNums){
            ignoreList = returnCurNumber(item, checkNums, ignoreList);
        }
        checkNums.removeAll(ignoreList);
        StringBuilder stringBuilder = new StringBuilder();

        Collections.sort(checkNums);
        for (int i = checkNums.size() - 1; i >= 0; i--){
            stringBuilder.append(checkNums.get(i)).append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        System.out.print(stringBuilder.toString());
    }

    /**
     * recursive method
     *
     * @param number
     * @param linkedList
     * @param ignoreList
     * @return
     */
    private static Set<Integer> returnCurNumber(int number, LinkedList<Integer> linkedList, Set<Integer> ignoreList) {
        // if number is even
        if (number % 2 == 0) {
            number = (number / 2);
            if(linkedList.contains(number)){
                ignoreList.add(number);
            }
        } else {
            // if number is odd number
            number = (number * 3 + 1) / 2;
            if(linkedList.contains(number)){
                ignoreList.add(number);
            }
        }
        if(number == 1){
            return ignoreList;
        }
        return returnCurNumber(number, linkedList, ignoreList);
    }
}
