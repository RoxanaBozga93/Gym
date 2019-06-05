package ro.sci.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GymClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Long idTrainer;
    private int duration; //in minutes, eg:60/90/...
    private int fee;
    private int capacity;

    protected GymClass() {
    }

    public GymClass(String name, Long idTrainer, int duration, int fee, int capacity) {
        this.name = name;
        this.idTrainer = idTrainer;
        this.duration = duration;
        this.fee = fee;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "GymClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idTrainer=" + idTrainer +
                ", duration=" + duration +
                ", fee=" + fee +
                ", capacity=" + capacity +
                '}';
    }

    public int getFee() {
        return fee;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getIdTrainer() {
        return idTrainer;
    }

    public int getDuration() {
        return duration;
    }
}
