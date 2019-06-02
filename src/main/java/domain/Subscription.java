package domain;


import enums.MONTH;
import enums.WEEKDAYS;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subscription {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private GymClass gymClass;
    private Trainer trainer;
    private Schedule schedule;


    public Subscription() {
    }

    public Subscription(Long id, GymClass gymClass, Trainer trainer, Schedule schedule) {
        this.id = id;
        this.gymClass = gymClass;
        this.trainer = trainer;
        this.schedule = schedule;
    }


    public GymClass getGymClass() {
        return gymClass;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", gymClass=" + gymClass +
                ", trainer=" + trainer +
                ", schedule=" + schedule +
                '}';
    }
}
