package eightdemo.thread;

public class ThreadDemoTwo extends Thread {
    private int count = 5;

    @Override
    public synchronized void run() {
        synchronized (this) {
            super.run();
            count--;
            String s = String.format("当前线程进行数据递减，线程编号：%s，当前count数据值：%s", Thread.currentThread().getName(), count);
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        ThreadDemoTwo threadDemoTwo = new ThreadDemoTwo();

        Thread threada = new Thread(threadDemoTwo, "A");
        Thread threadb = new Thread(threadDemoTwo, "B");
        Thread threadc = new Thread(threadDemoTwo, "C");
        Thread threadd = new Thread(threadDemoTwo, "D");
        Thread threade = new Thread(threadDemoTwo, "E");

        threada.start();
        threadb.start();
        threadc.start();
        threadd.start();
        threade.start();
    }
}
