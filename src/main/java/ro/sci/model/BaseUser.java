// tag::sample[]
package ro.sci.model;

import org.springframework.data.annotation.Id;
import ro.sci.enums.ROLES;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseUser {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String pass;
    private String phone;
    private ROLES roles;

    protected BaseUser() {}

    public BaseUser(String firstName, String lastName, String email, String pass, String phone, ROLES roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pass = pass;
        this.phone = phone;
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "BaseUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", phone='" + phone + '\'' +
                ", roles=" + roles +
                '}';
    }

// end::sample[]




    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public String getPhone() {
        return phone;
    }

    public ROLES getIdRole() {
        return roles;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BaseUser))
            return false;
        BaseUser other = (BaseUser) o;
        boolean emailEquals = (this.email == null && other.email == null)
                || (this.email != null && this.email.equals(other.email));
        return emailEquals;
    }

}

