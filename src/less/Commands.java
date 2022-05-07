package less;

public abstract class Commands {

    private String nameOrganization;
    private int power1;
    private int power2;
    private int power3;
    private int power4;
    private int power5;
    private int iqCapitan;
    private int iqTrainer;
    private int totalPower = power1 + power2 + power3 + power4 + power5 + (iqCapitan + iqTrainer)*5;


    public Commands(String nameOrganization, int power1, int power2, int power3, int power4, int power5, int iqCapitan, int iqTrainer) {
        this.nameOrganization = nameOrganization;
        this.power1 = power1;
        this.power2 = power2;
        this.power3 = power3;
        this.power4 = power4;
        this.power5 = power5;
        this.iqCapitan = iqCapitan;
        this.iqTrainer = iqTrainer;
    }

    public Commands() {

    }

    public String getNameOrganization() {
        return nameOrganization;
    }

    public void setNameOrganization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }

    public int getPower1() {
        return power1;
    }

    public void setPower1(int power1) {
        this.power1 = power1;
    }

    public int getPower2() {
        return power2;
    }

    public void setPower2(int power2) {
        this.power2 = power2;
    }

    public int getPower3() {
        return power3;
    }

    public void setPower3(int power3) {
        this.power3 = power3;
    }

    public int getPower4() {
        return power4;
    }

    public void setPower4(int power4) {
        this.power4 = power4;
    }

    public int getPower5() {
        return power5;
    }

    public void setPower5(int power5) {
        this.power5 = power5;
    }

    public int getIqCapitan() {
        return iqCapitan;
    }

    public void setIqCapitan(int iqCapitan) {
        this.iqCapitan = iqCapitan;
    }

    public int getIqTrainer() {
        return iqTrainer;
    }

    public void setIqTrainer(int iqTrainer) {
        this.iqTrainer = iqTrainer;
    }

    public int getTotalPower() {
        return totalPower;
    }

    public void setTotalPower(int totalPower) {
        this.totalPower = totalPower;
    }
}
