package eightdemo;

import advice.DemoAdvice;

public class AdviceDemo {
    @DemoAdvice
    public static String print() {
        return "z";
    }

    public static void main(String[] args) {
        System.out.println(print());
    }
}
