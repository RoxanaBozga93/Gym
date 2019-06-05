package ro.sci.model;


import org.springframework.data.annotation.Id;
import ro.sci.enums.ROLES;

import javax.persistence.*;

@Entity
//@Table(name = "trainer")
//@NamedEntityGraph(name="ro.sci.model.BaseUser",
//        attributeNodes={
//                @NamedAttributeNode(value="id"),
//                @NamedAttributeNode(value="firstName"),
//                @NamedAttributeNode(value="lastName"),
//                @NamedAttributeNode(value="email"),
//                @NamedAttributeNode(value="pass"),
//                @NamedAttributeNode(value="phone"),
//                @NamedAttributeNode(value="roles"),
//        }  )
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Trainer extends BaseUser {

    private String speciality;
    private int fee;

    public Trainer() {
    }


    public Trainer(String firstName, String lastName, String email, String pass, String phone, ROLES roles, String speciality, int fee) {
        super(firstName, lastName, email, pass, phone, roles);
        this.speciality = speciality;
        this.fee = fee;
    }

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
