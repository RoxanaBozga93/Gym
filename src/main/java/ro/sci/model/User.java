package ro.sci.model;

import ro.sci.enums.ROLES;


import javax.persistence.*;

@Entity
//@Table(name = "user")
//@NamedEntityGraph(name="ro.sci.model.BaseUser",
//        attributeNodes={
//        @NamedAttributeNode(value="id"),
//        @NamedAttributeNode(value="firstName"),
//                @NamedAttributeNode(value="lastName"),
//                @NamedAttributeNode(value="email"),
//                @NamedAttributeNode(value="pass"),
//                @NamedAttributeNode(value="phone"),
//                @NamedAttributeNode(value="roles"),
//        }  )
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User extends BaseUser {


    public User(String firstName, String lastName, String email, String pass, String phone, ROLES roles){
        super(firstName, lastName, email, pass, phone, roles);
    }

}
