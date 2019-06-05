package ro.sci.model;



import ro.sci.enums.MONTH;
import ro.sci.enums.WEEKDAYS;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long idGymClass;
    private Long idTrainer;
    private Enum<MONTH> month;
    private Enum<WEEKDAYS> week;
    private String hour;


    public Schedule() {
    }


    public Schedule(Long idGymClass, Long idTrainer, Enum<MONTH> month, Enum<WEEKDAYS> week, String hour) {
        this.idGymClass = idGymClass;
        this.idTrainer = idTrainer;
        this.month = month;
        this.week = week;
        this.hour = hour;
    }

    public Long getId() {
        return id;
    }

    public Long getIdGymClass() {
        return idGymClass;
    }

    public Long getIdTrainer() {
        return idTrainer;
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
                ", idGymClass=" + idGymClass +
                ", idTrainer=" + idTrainer +
                ", month=" + month +
                ", week=" + week +
                ", hour='" + hour + '\'' +
                '}';
    }
}
