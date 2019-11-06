package eightdemo;

import advice.DemoAdvice;
import com.sun.org.apache.xml.internal.utils.Trie;
import eightdemo.dao.Apple;
import eightdemo.dao.Shop;

import java.lang.reflect.Proxy;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.stream.Stream;

public class CloneDemo {
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= Integer.MAX_VALUE) ? Integer.MAX_VALUE : n + 1;
    }

    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException {
       LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<>();
       String tar = "hello world ee";
       char[] array = tar.toCharArray();
       for (char item : array) {
           if (item == ' ') {
               continue;
           }
           if (countMap.containsKey(item)) {
               countMap.put(item, countMap.get(item) + 1);
           } else {
               countMap.put(item, 1);
           }
       }
       int max = 1;
       char a = ' ';
       for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
           if (entry.getValue() > max) {
               a = entry.getKey();
               max = entry.getValue();
           }

       }
        System.out.println(a);
    }


}
