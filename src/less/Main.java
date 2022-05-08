package less;

public class Main {

    public static void main(String[] args) {

        int fn = 0, fazePointNavi = 0, naviPointFaze = 0;
        while (fn <= 30) {
            Faze faze = new Faze("Faze", (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))));
            Navi navi = new Navi("Navi", (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))));

            if (faze.totalPower() > navi.totalPower()) {
                fn++;
                fazePointNavi++;
                System.out.println("Faze win round");
            } else if (faze.totalPower() < navi.totalPower()) {
                fn++;
                naviPointFaze++;
                System.out.println("Navi win round");
            }


            if (fazePointNavi == 16){
                System.out.println("\nCongratulations Faze!\n");
                break;
            }else if(naviPointFaze == 16){
                System.out.println("\nCongratulations Navi!\n");
                break;
            }else if(fazePointNavi && naviPointFaze == 15){
                fn -= 6;
                fazePointNavi -= 3;
                naviPointFaze -= 3;
            }

        }
        System.out.println("Исход встречи : " + fazePointNavi + " Faze     "+ naviPointFaze + " Navi");




    }
}
