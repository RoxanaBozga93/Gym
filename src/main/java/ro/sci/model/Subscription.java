package ro.sci.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subscription {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long idGymClass;
    private Long idTrainer;
    private Long idSchedule;


    public Subscription() {
    }

    public Subscription(Long id, Long idGymClass, Long idTrainer, Long idSchedule) {
        this.id = id;
        this.idGymClass = idGymClass;
        this.idTrainer = idTrainer;
        this.idSchedule = idSchedule;
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

    public Long getIdSchedule() {
        return idSchedule;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", idGymClass=" + idGymClass +
                ", idTrainer=" + idTrainer +
                ", idSchedule=" + idSchedule +
                '}';
    }


}
