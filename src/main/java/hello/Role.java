package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String userType;

    protected Role() {}

    public Role(String userType) {
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

    public String getUserType() {
        return userType;
    }
}