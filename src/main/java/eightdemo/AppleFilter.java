package eightdemo;

import eightdemo.dao.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppleFilter {

    public void filterTest() {
        List<Apple> appleList = new ArrayList<>();

        appleList.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        appleList.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
    }

    public void runnableTest() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });

        Thread t = new Thread(() -> System.out.println(""));
    }

}
