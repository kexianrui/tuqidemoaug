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
        String source = "160115002240293067\n" +
                "161221105125323938\n" +
                "171209153635000000\n" +
                "180504151609000002\n" +
                "180516113704000002\n" +
                "190114120336000000\n" +
                "190214201936000000\n" +
                "190220161952000000\n" +
                "190603163542262148\n" +
                "190610182822262144\n" +
                "190725153842000001\n" +
                "190829181107000000";
        String split = ",";
        String result = splitData(source, split);
        if (result.endsWith(",")) {
            result = result.substring(0, result.length() - 2);
        }
        System.out.println(result);

//        print();
//        String l = "23201910151018352108010";
//        System.out.println(Long.valueOf(l));
    }
}
