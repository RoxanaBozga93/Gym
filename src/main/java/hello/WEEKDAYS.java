package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
