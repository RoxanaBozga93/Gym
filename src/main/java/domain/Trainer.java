package domain;


import enums.ROLES;

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
