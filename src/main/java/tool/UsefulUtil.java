package tool;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UsefulUtil {

    /**
     * 换行符转换成需要的分隔符
     *
     * @param source    原字符串
     * @param split     分隔符
     * @return  分隔后的字符串
     */
    private static String splitData(String source, String split) {
        if (null == source || null  == split) {
            return "param is null";
        }
        return source.replace("\n", split);
    }

    private static void print() {
        List<Long> longs = new ArrayList<>();
        longs.add(1L);
        longs.add(2L);
        longs.add(3L);
        Object obj = longs;
        List<Long> longs2 = (List<Long>) obj;
        for (Long aLong : longs2) {
            System.out.println(aLong);
        }
    }

    public static void main(String[] args) {
//        String source = "873\n" +
//                "1407\n" +
//                "1\n" +
//                "6298\n" +
//                "589\n" +
//                "12880\n" +
//                "6350\n" +
//                "1201\n" +
//                "21238\n" +
//                "21030\n" +
//                "21031\n" +
//                "17457\n" +
//                "110\n" +
//                "2\n" +
//                "279\n" +
//                "982\n" +
//                "18748\n" +
//                "24276\n" +
//                "706\n" +
//                "26000\n" +
//                "44399";
//        String split = ",";
//        String result = splitData(source, split);
//        if (result.endsWith(",")) {
//            result = result.substring(0, result.length() - 2);
//        }
//        System.out.println(result);

//        print();
        String l = "23201910151018352108010";
        System.out.println(Long.valueOf(l));
    }
}
