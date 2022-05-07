package less;

public class Heroic extends Commands implements Mathes{
    public Heroic(String nameOrganization, int power1, int power2, int power3, int power4, int power5, int iqCapitan, int iqTrainer) {
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
        System.out.println("cadiaN");
    }

    @Override
    public void player2() {
        System.out.println("refrezh");
    }

    @Override
    public void player3() {
        System.out.println("stavn");
    }

    @Override
    public void player4() {
        System.out.println("TeSeS");
    }

    @Override
    public void player5() {
        System.out.println("sjuush");
    }

    @Override
    public void trainer() {
        System.out.println("Xizt");

    }

    @Override
    public void seo() {
        System.out.println("Йоахим NoobworK Харальдсен ");
    }

    @Override
    public void sponsors() {
        System.out.println("Red Bull");
    }

    @Override
    public void chacneToWin() {
        double chanceToWin = 16;

        */
    }

