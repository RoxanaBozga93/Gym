package enums;

import javax.persistence.Entity;

@Entity
public enum WEEKDAYS {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int numDay;
    WEEKDAYS(int numDay) {
        this.numDay = numDay;
    }
    public int getNumDay() {
        return numDay;
    }
}
