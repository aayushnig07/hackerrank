package Java;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Qus12 {
    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.toString();
    }

    
}