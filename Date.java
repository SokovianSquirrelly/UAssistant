import java.time.LocalDate;

public class Date {
    private final int month;
    private final int day;
    private final int year;

    Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    String getDateAmericanFormat() {
        return month + "/" + day + "/" + year;
    }

    boolean hasDatePassed() {
        LocalDate local = LocalDate.now();

        if (this.year > local.getYear()) {
            return true;
        }
        else if (this.year < local.getYear()) {
            return false;
        }

        if (this.month > local.getMonthValue()) {
            return true;
        }
        else if (this.month < local.getMonthValue()) {
            return false;
        }

        return this.day > local.getDayOfMonth();
    }
}
