package eightdemo.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dish {
    private String name;
    private Boolean vegetarian;
    private Integer calories;
    private Type type;

    public enum Type { MEAT, FISH, OTHER }
    public enum CaloricLevel { DIET, NORMAL, FAT }
}
