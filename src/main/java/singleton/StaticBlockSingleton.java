package singleton;

/**
 * All rights Reserved
 *
 * @Package singleton
 * @author: tuqi（tuqi@maihaoche.com）
 * @date: 2018/8/20 下午5:17
 * 静态块模式
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("运行时异常");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
