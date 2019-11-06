package singleton;

/**
 * Created by tuqi on 2018/8/20.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance = null;

    public ThreadSafeSingleton() {}

    /**
     * 使用synchronized关键字修饰获取对象实例的方法，保证多线程的情况下获取唯一实例
     * @return
     */
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }

    /**
     * 细化同步块粒度，只对获取实例的使用双检查锁定
     * @return
     */
    public static ThreadSafeSingleton getInstanceUsingDoubleLock() {
        if (instance == null) {
            synchronized(ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }

    public static void main(String[] args) {

    }
}
