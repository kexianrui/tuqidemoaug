package eightdemo.thread;

public class ThreadDemo extends Thread {
    private int count = 5;

    public ThreadDemo(String name) {
        super();
        this.setName(name);
    }
    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            String s = String.format("当前线程进行数据递减，线程编号：%s，当前count数据值：%s", ThreadDemo.currentThread().getName(), String.valueOf(count));
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemoA = new ThreadDemo("A");
        Thread daemonThread = new Thread(threadDemoA);
        daemonThread.setDaemon(true);
        daemonThread.run();
    }
}
