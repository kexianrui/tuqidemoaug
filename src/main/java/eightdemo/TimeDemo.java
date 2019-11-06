package eightdemo;


import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TimeDemo {
    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.of(2019, 1, 4);
//        localDate.getYear();
//        localDate.getMonth();

        LocalDate localDate = LocalDate.parse("2019-01-07");
        LocalTime localTime = LocalTime.parse("15:57:01");
//        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(2019, Month.JANUARY, 7, 15, 03, 30);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        LocalDateTime localDateTime2 = localDate.atTime(16, 54, 31);
        LocalDateTime localDateTime3 = localDate.atTime(localTime);
//        System.out.println(localDateTime3);

        LocalDate localDate1 = localDateTime.toLocalDate();
        LocalTime localTime1 = localDateTime.toLocalTime();

        Instant instant = Instant.ofEpochSecond(3);
        Instant instant1 = Instant.ofEpochSecond(3, 0);
        Instant instant2 = Instant.ofEpochSecond(2, 1_000_000_000);
        Instant instant3 = Instant.ofEpochSecond(4, -1_000_000_000);
//        System.out.println(instant + "\n" + instant1 + "\n" + instant2 + "\n" + instant3);

//        int day = Instant.now().get(ChronoField.DAY_OF_MONTH);
        Duration between = Duration.between(localTime, localTime1);
        Duration between1 = Duration.between(localDateTime1, localDateTime2);
        Duration between2 = Duration.between(instant1, instant2);

        Period between3 = Period.between(LocalDate.of(2014, 3, 8), LocalDate.of(2014, 3, 18));
//        System.out.println(between3);

        Duration duration = Duration.ofMinutes(100);
        Duration duration1 = Duration.of(3, ChronoUnit.MINUTES);
//        System.out.println(duration1);

        Period period = Period.ofDays(10);
        Period period1 = Period.ofWeeks(3);
        Period period2 = Period.of(2, 6, 21);
//        System.out.println(period + "\n" + period1 + "\n" + period2);

        LocalDate localDate2 = LocalDate.of(2019, 1, 8);
        LocalDate localDate3 = localDate2.plusWeeks(1);
        LocalDate localDate4 = localDate2.plusYears(1);

        System.out.println();
    }
}
