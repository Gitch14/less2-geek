package less;

public class Faze extends Commands implements Mathes{
    public Faze(String nameOrganization, int power1, int power2, int power3, int power4, int power5, int iqCapitan, int iqTrainer) {
        super(nameOrganization, power1, power2, power3, power4, power5, iqCapitan, iqTrainer);
    }

    @Override
    public int totalPower() {
        int totalPower = getPower1()+getPower2()+getPower3()+getPower4()+getPower5()+(getIqCapitan()+getIqTrainer())*5;
        return totalPower;
    }

    @Override
    public void players() {

    }

    /*
    @Override
    public void player1() {
        System.out.println("Twistzz");
    }

    @Override
    public void player2() {
        System.out.println("ropz");
    }

    @Override
    public void player3() {
        System.out.println("broky");
    }

    @Override
    public void player4() {
        System.out.println("rain");
    }

    @Override
    public void player5() {
        System.out.println("karrigan");
    }

    @Override
    public void trainer() {
        System.out.println("Robban");

    }

    @Override
    public void seo() {
        System.out.println("Евгений Золотарев");
    }

    @Override
    public void sponsors() {
        System.out.println("Manchester City, nissan, Gaming SteelSeries");
    }

    @Override
    public void chacneToWin() {
        double chanceToWin = 22;
    }

     */
}
