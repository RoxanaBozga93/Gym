package domain;

import enums.ROLES;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private ROLES userType;

    protected Role() {}

    public Role(ROLES userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", userType='" + userType + '\'' +
                '}';
    }

// end::sample[]


    public int getId() {
        return id;
    }

    public ROLES getUserType() {
        return userType;
    }
}