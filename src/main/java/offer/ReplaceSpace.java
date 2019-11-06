package offer;

/**
 * Created by tuqi on 28/02/2018.
 */
public class ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
        for (int i = 0; i < str.length(); i++) {
            char demo = ' ';
            if (str.charAt(i) == demo) {
                str.replace(i, i+1, "%20");
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We Are Happy.")));
    }
}
