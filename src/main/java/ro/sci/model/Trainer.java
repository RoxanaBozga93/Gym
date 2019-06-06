package ro.sci.model;


import org.springframework.data.annotation.Id;
import ro.sci.enums.ROLES;

import javax.persistence.*;

@Entity
@Table(name = "Trainer")
public class Trainer extends User {


    private String speciality;
    private int fee;



    @Override
    public String toString() {
        return "Trainer{" +
                "speciality='" + speciality + '\'' +
                ", fee=" + fee +
                '}';
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getFee() {
        return fee;
    }
}
