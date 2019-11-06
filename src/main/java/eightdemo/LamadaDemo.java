package eightdemo;

import eightdemo.dao.Apple;
import eightdemo.dao.Dish;
import eightdemo.dao.Trader;
import eightdemo.dao.Transaction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class LamadaDemo {

    public void t1() {
        Comparator<Apple> comparator = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
    }

    public static String processFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("xx.txt"))) {
            return br.readLine();
        }
    }

    public void predicateTest() {
        List<Apple> appleList = new ArrayList<>();
        appleList.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getCountry));

        Function<Integer, Integer> subtract = x -> x - 1;
        Function<Integer, Integer> multiple = x -> x * 2;
        Function<Integer, Integer> mix = subtract.andThen(multiple);
        int result = mix.apply(8);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 33, 5, 9, 19, 100, 4, 2, 5);

//        integerList.sort(Integer::compareTo);
//        integerList.forEach(item -> System.out.println(item));

        List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));

//        menu.stream()
//                .filter(dish -> dish.getCalories() < 400)
//                .sorted(Comparator.comparing(Dish::getCalories))
//                .map(Dish::getName)
//                .collect(Collectors.toList()).forEach(System.out::println);

//        menu.forEach(System.out::println);

//        List<String> words = Arrays.asList("Hello World");
//        List<String> collect = words.stream()
//                .map(word -> word.split(""))
//                .flatMap(Arrays::stream)
//                .distinct()
//                .collect(Collectors.toList());
//        collect.forEach(System.out::println);
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        numbers.stream().map(n -> n * n).forEach(System.out::println);
//
//        List<Integer> number1 = Arrays.asList(1, 2, 3);
//        List<Integer> number2 = Arrays.asList(3, 4);
//        System.out.println(number1.stream().flatMap(i -> number2.stream().map(j -> new int[]{i, j})).collect(Collectors.toList()));
//        number1.stream().flatMap(i -> number2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[]{i, j})).collect(Collectors.toList());

//        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7);
//        Optional<Integer> sum = number.stream().reduce((a, b) -> a + b);
//        System.out.println(sum.get());

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));
        //找出2011年发生的所有交易，并按交易额排序（从低到高）。
//        List<Transaction> collect1 = transactions.stream().filter(item -> item.getYear().equals(2011)).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
//        collect1.forEach(System.out::println);
        //(2) 交易员都在哪些不同的城市工作过？
//        List<String> collect2 = transactions.stream().map(item -> item.getTrader().getCity()).collect(Collectors.toSet());
//        collect2.forEach(System.out::println);
        //(3) 查找所有来自于剑桥的交易员，并按姓名排序。
//        List<Trader> cambridge = transactions.stream().map(item -> item.getTrader()).distinct().filter(item -> item.getCity().equals("Cambridge")).sorted(Comparator.comparing(item -> item.getName())).collect(Collectors.toList());
//        cambridge.forEach(System.out::println);
        //(4) 返回所有交易员的姓名字符串，按字母顺序排序。
//        String collect = transactions.stream().map(item -> item.getTrader().getName()).sorted().distinct().reduce("", (c1, c2) -> c1 + c2);
//        System.out.println(collect);
        //(5) 有没有交易员是在米兰工作的？
//        boolean milan = transactions.stream().anyMatch(item -> item.getTrader().getCity().equals("Milan"));
        //(6) 打印生活在剑桥的交易员的所有交易额。
//        transactions.stream().filter(item -> item.getTrader().getCity().equals("Cambridge")).map(Transaction::getValue).forEach(System.out::println);
        //(7) 所有交易中，最高的交易额是多少？
//        Optional<Integer> reduce = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
//        System.out.println(reduce.get());
        //(8) 找到交易额最小的交易。
//        Optional<Transaction> min = transactions.stream().min(Comparator.comparing(Transaction::getValue));
//        Optional<Transaction> min = transactions.stream().reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
//        System.out.println(min.get());

//        IntStream.rangeClosed(1, 100)
//                .filter(b -> Math.sqrt(2 * 2 + b * b) % 1 == 0)
//                .boxed()
//                .map(b -> new int[]{2, b, Math.sqrt(2 * 2 + b * b)});

//        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).limit(20).map(t -> t[0]).forEach(System.out::println);
//        System.out.println(menu.stream().map(Dish::getName).collect(Collectors.joining(", ")));
//        menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
//        Map<Dish.Type, List<Dish>> groupBy = menu.stream().collect(Collectors.groupingBy(Dish::getType));
//        Map<Dish.CaloricLevel, List<Dish>> groupByCalor = menu.stream().collect(Collectors.groupingBy(item -> {
//            if (item.getCalories() <= 400) {
//                return Dish.CaloricLevel.DIET;
//            } else if (item.getCalories() >= 700) {
//                return Dish.CaloricLevel.FAT;
//            } else {
//                return Dish.CaloricLevel.NORMAL;
//            }
//        }));
//        Map<Dish.Type, Map<Dish.CaloricLevel, List<Dish>>> finalGroup = menu.stream()
//                .collect(Collectors.groupingBy(Dish::getType, Collectors.groupingBy(item -> {
//                    if (item.getCalories() <= 400) {
//                        return Dish.CaloricLevel.DIET;
//                    } else if (item.getCalories() >= 700) {
//                        return Dish.CaloricLevel.FAT;
//                    } else {
//                        return Dish.CaloricLevel.NORMAL;
//                    }
//                })));
//        Map<Dish.Type, Dish> mostCaloriesGroupByType = menu.stream()
//                .collect(groupingBy(Dish::getType
//                , Collectors.collectingAndThen(Collectors.maxBy(comparing(Dish::getCalories)), Optional::get)));
//        Map<Dish.Type, Set<Dish.CaloricLevel>> typeSetMap = menu.stream().collect(groupingBy(Dish::getType, mapping(dish -> {
//            if (dish.getCalories() <= 400) {
//                return Dish.CaloricLevel.DIET;
//            } else if (dish.getCalories() <= 700) {
//                return Dish.CaloricLevel.NORMAL;
//            } else {
//                return Dish.CaloricLevel.FAT;
//            }
//        }, toSet())));
//        Map<Dish.Type, HashSet<Dish.CaloricLevel>> typeHashSetMap = menu.stream().collect(groupingBy(Dish::getType, mapping(item -> {
//            if (item.getCalories() <= 400) {
//                return Dish.CaloricLevel.DIET;
//            } else if (item.getCalories() <= 700) {
//                return Dish.CaloricLevel.NORMAL;
//            } else {
//                return Dish.CaloricLevel.FAT;
//            }
//        }, toCollection(HashSet::new))));

//        IntSupplier intSupplier = new IntSupplier() {
//            private int previous = 0;
//            private int currency = 1;
//            @Override
//            public int getAsInt() {
//                int oldPrevious = this.previous;
//                int nextValue = this.previous + this.currency;
//                this.previous = this.currency;
//                this.currency = nextValue;
//                return oldPrevious;
//            }
//        };
//        Supplier<Integer> supplier = new Supplier<Integer>() {
//            @Override
//            public Integer get() {
//                return null;
//            }
//        };
//
//        IntStream limit = IntStream.generate(intSupplier).limit(10);

//        IntSummaryStatistics collect = menu.stream().collect(summarizingInt(Dish::getCalories));

//        System.out.println(collect);
    }

    public Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n).boxed().collect(partitioningBy(candidite -> isPrime(candidite)));
    }

    private boolean isPrime(Integer candidite) {
        int candiditeRoot = (int) Math.sqrt((double) candidite);
        return IntStream.rangeClosed(2, candidite).noneMatch(i -> candidite % i == 0);
    }
}
