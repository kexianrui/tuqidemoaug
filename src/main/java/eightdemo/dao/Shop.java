package eightdemo.dao;

import eightdemo.FutureDemo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop implements Cloneable {
    private String name;

    private Integer age;

    private String address;

    private Apple apple;

    public double getPrice(String product) {
        return calculatePrice(product);
    }

    public double calculatePrice(String product) {
        FutureDemo.deloy();
        return Math.random() * product.charAt(0) * product.charAt(1);
    }

    @Override
    public Shop clone() throws CloneNotSupportedException {
        Shop cloneShop = (Shop) super.clone();

        Apple cloneApple = apple.clone();
        cloneShop.setApple(cloneApple);
        return cloneShop;
    }
}
