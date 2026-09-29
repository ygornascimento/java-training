import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Esse programa imprime um calendário do mês atual
 */



public class CJ1CalendarDemo {
    public static void main (String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today -1); // set to start of month
        DayOfWeek weekDay = date.getDayOfWeek();
        int value  = weekDay.getValue(); // 1 = Monday, ... , 7 = Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month) {
            System.out.print("%3d".formatted(date.getDayOfMonth()));
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}