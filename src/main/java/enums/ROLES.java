package enums;

public enum ROLES {
    ADMIN(1),
    USER(2),
    TRAINER(3);

    private int numRole;

    ROLES(int numRole) {
        this.numRole = numRole;
    }

    public int getNumRole() {
        return numRole;
    }
}
