package ro.sci.model;

import org.springframework.data.annotation.Id;
import ro.sci.enums.ROLES;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin extends User {

    public Admin(){

    }

    public Admin(String firstName, String lastName, String email, String pass, String phone) {
        super(firstName, lastName, email, pass, phone);
    }


}
