package eightdemo;

public class SingletonDemo {
    private static volatile SingletonDemo singletonDemo;

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        if (null == singletonDemo) {
            synchronized (SingletonDemo.class) {
                if (null == singletonDemo) {
                    singletonDemo = new SingletonDemo();
                }
            }
        }
        return singletonDemo;
    }
}
