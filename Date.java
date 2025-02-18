import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        // System.out.println(date);
        LocalDate date2 = LocalDate.parse("22-02-2006",DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        Period period = Period.between(date2, date1);
        // System.out.println(period);
        System.out.println("Day :"+period.getDays()+"\nMonth: "+period.getMonths()+"\nYear: "+period.getYears());
    }
}
