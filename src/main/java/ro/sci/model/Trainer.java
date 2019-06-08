package ro.sci.model;


import javax.persistence.*;

@Entity
@Table(name = "Trainer")
public class Trainer extends User {


    private String speciality;
    private float salary;


    public Trainer() {
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "speciality='" + speciality + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getSpeciality() {
        return speciality;
    }

    public float getSalary() {
        return salary;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
