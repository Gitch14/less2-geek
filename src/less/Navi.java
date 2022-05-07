package less;

public class Navi extends Commands implements Mathes{

    public Navi(String nameOrganization, int power1, int power2, int power3, int power4, int power5, int iqCapitan, int iqTrainer) {
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
    public void player1() {
        System.out.println("S1mple");
        int power = 89 + (int) (Math.random() * ((98 - 89) + 1));
        System.out.println(power);
        naviPower[0] = power;
    }

    public void player2() {
        System.out.println("b1t");
        int power = 80 + (int) (Math.random() * ((93 - 80) + 1));
        System.out.println(power);
        naviPower[1] = power;
    }


    public void player3() {
        System.out.println("Perfecto");
        int power = 75 + (int) (Math.random() * ((83 - 75) + 1));
        System.out.println(power);
        naviPower[2] = power;
    }


    public void player4() {
        System.out.println("Electronik");
        int power = 85 + (int) (Math.random() * ((93 - 85) + 1));
        System.out.println(power);
        naviPower[3] = power;
    }


    public void player5() {
        System.out.println("Boomi4");
        int power = 74 + (int) (Math.random() * ((80 - 74) + 1));
        int iqCall = 1 + (int) (Math.random() * ((5 - 1) + 1));
        naviPower[4] = power;
        naviTacticts[0] = iqCall;
    }

    public void trainer() {
        System.out.println("B1ad3");
        int tactictsIq = 5 + (int) (Math.random() * ((10 - 5) + 1));
        naviTacticts[1] = tactictsIq;
    }


    public void seo() {
        System.out.println("Евгений Золотарев");
    }

    public void sponsors() {
        System.out.println("Parimatch, Puma, logitech");
    }

*/

}
