package eightdemo.dao;

import lombok.Data;

/**
 * @author tuqi
 */
@Data
public class Apple implements Cloneable{

    private Integer weight;

    private String color;

    private String country;

    @Override
    public Apple clone() throws CloneNotSupportedException {
        return (Apple) super.clone();
    }
}
