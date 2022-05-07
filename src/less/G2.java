package less;

public class G2 extends Commands implements Mathes {

    public G2(String nameOrganization, int power1, int power2, int power3, int power4, int power5, int iqCapitan, int iqTrainer) {
        super(nameOrganization, power1, power2, power3, power4, power5, iqCapitan, iqTrainer);
    }


    @Override
    public int totalPower() {
        int totalPower = getPower1() + getPower2() + getPower3() + getPower4() + getPower5() + (getIqCapitan() + getIqTrainer()) * 5;
        return totalPower;
    }

    @Override
    public void players() {

    }
}
    /*
    @Override
    public void player1() {
        System.out.println("Niko");
    }

    @Override
    public void player2() {
        System.out.println("huNter-");
    }

    @Override
    public void player3() {
        System.out.println("Jackz");
    }

    @Override
    public void player4() {
        System.out.println("Aleksib");
    }

    @Override
    public void player5() {
        System.out.println("mONESY");
    }

    @Override
    public void trainer() {
        System.out.println("XTQZZZ");

    }

    @Override
    public void seo() {
        System.out.println("Карлос Родригес Сантьяго");
    }

    @Override
    public void sponsors() {
        System.out.println("BMV, Aidas, dominos");
    }

    @Override
    public void chacneToWin() {
        double chanceToWin = 15;
    }

     */

