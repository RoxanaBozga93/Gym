package ro.sci.model;

import ro.sci.enums.ROLES;

import javax.persistence.*;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Table(name = "admin")
public class Admin extends BaseUser {

    public Admin(String firstName, String lastName, String email, String pass, String phone, ROLES roles){
        super(firstName, lastName, email, pass, phone, roles);
    }

}
