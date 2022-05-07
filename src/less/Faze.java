package less;

public class Faze extends Commands implements Mathes{
    protected Faze(String nameOrganization, int power1, int power2, int power3, int power4, int power5, int iqCapitan, int iqTrainer) {
        super(nameOrganization, power1, power2, power3, power4, power5, iqCapitan, iqTrainer);
    }

    @Override
    public int totalPower() {
        int totalPower = getPower1()+getPower2()+getPower3()+getPower4()+getPower5()+(getIqCapitan()+getIqTrainer())*5;
        return totalPower;
    }
}
