package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GymClass {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    private BaseUser idTrainer;
    private int duration; //in minutes, eg:60/90/...

    protected GymClass() {}

    public GymClass(String name, BaseUser idTrainer, int duration) {
        this.name = name;
        this.idTrainer = idTrainer;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "GymClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idTrainer=" + idTrainer +
                ", duration=" + duration +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BaseUser getIdTrainer() {
        return idTrainer;
    }

    public int getDuration() {
        return duration;
    }
}
