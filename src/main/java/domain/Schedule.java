package domain;

import enums.MONTH;
import enums.WEEKDAYS;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private GymClass gymClass;
    private Trainer trainer;
    private Enum<MONTH> month;
    private Enum<WEEKDAYS> week;
    private String hour;


    public Schedule() {
    }


    public Schedule(Long id, GymClass gymClass, Trainer trainer, Enum<MONTH> month, Enum<WEEKDAYS> week, String hour) {
        this.id = id;
        this.gymClass = gymClass;
        this.trainer = trainer;
        this.month = month;
        this.week = week;
        this.hour = hour;
    }

    public GymClass getGymClass() {
        return gymClass;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public Enum<MONTH> getMonth() {
        return month;
    }

    public Enum<WEEKDAYS> getWeek() {
        return week;
    }

    public String getHour() {
        return hour;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", gymClass=" + gymClass +
                ", trainer=" + trainer +
                ", month=" + month +
                ", week=" + week +
                ", hour='" + hour + '\'' +
                '}';
    }
}
