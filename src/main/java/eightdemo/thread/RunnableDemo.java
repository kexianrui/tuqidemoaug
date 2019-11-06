package eightdemo.thread;

public class RunnableDemo implements Runnable{
    private int count = 5;

    @Override
    public void run() {
        System.out.println("运行run方法");
    }

    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread = new Thread(runnableDemo);
        thread.start();
        System.out.println("run结束");
    }
}
