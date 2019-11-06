package eightdemo.staticp;

public class StaticTest3 {
    private static String name = getName();

    private String address = getAddress();

    static{
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类代码块");
    }

    public StaticTest3() {
        System.out.println("父类构造函数");
    }

    private String getAddress() {
        System.out.println("父类成员变量");
        return null;
    }

    private static String getName() {
        System.out.println("父类静态变量");
        return null;
    }

    public static void main(String[] args) {
        new StaticTest3();
    }
}
