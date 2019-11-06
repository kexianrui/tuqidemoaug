package eightdemo;

public class OverrideDemo {
//    public static void om(Object o) {
//        System.out.println("use object method");
//    }

    public static void om(Integer i) {
        System.out.println("use integer method");
    }

    public static void om(int i) {
        System.out.println("use int method");
    }

    public static void main(String[] args) {
        Long l = new Long(1L);
        om(Math.toIntExact(l));
    }
}
