package less;

public class Main {

    public static void main(String[] args) {


        int ng = 0, naviPointG2 = 0, g2PointNavi = 0;
        boolean naviBool = false,fazeBool = false;
        while (ng <= 30) {
            Navi navi = new Navi("Navi", (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))));
            G2 g2 = new G2("G2", (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))));
            if (navi.totalPower() > g2.totalPower()) {
                ng++;
                naviPointG2++;
                System.out.println("Navi win round");
            } else if (navi.totalPower() < g2.totalPower()) {
                ng++;
                g2PointNavi++;
                System.out.println("G2 win round");
            }


            if (naviPointG2 == 16){
                naviBool = true;
                System.out.println("Navi win");
                break;
            }else if(g2PointNavi == 16){
                System.out.println("G2 win");
                break;
            }else if(naviPointG2 >= 15 && g2PointNavi >= 15){
                ng -= 6;
                naviPointG2 -= 3;
                g2PointNavi -= 3;
            }
        }

        System.out.println("Исход встречи : " + naviPointG2 + " Navi     "+ g2PointNavi + " G2");

        int fh = 0, fazePointHeroic = 0, heroicPointFaze = 0;
        while (fh <= 30) {
            Faze faze = new Faze("Faze", (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))));
            Heroic heroic = new Heroic("Heroic", (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))));

            if (faze.totalPower() > heroic.totalPower()) {
                fh++;
                fazePointHeroic++;
                System.out.println("Faze win round");
            } else if (faze.totalPower() < heroic.totalPower()) {
                fh++;
                heroicPointFaze++;
                System.out.println("Heroic win round");
            }


            if (fazePointHeroic == 16){
                fazeBool = true;
                System.out.println("Faze win");
                break;
            }else if(heroicPointFaze == 16){
                System.out.println("Heroic win");
                break;
            }else if(fazePointHeroic >= 15 && heroicPointFaze >= 15){
                fh -= 6;
                fazePointHeroic -= 3;
                heroicPointFaze -= 3;
            }
        }
        System.out.println("Исход встречи : " + fazePointHeroic + " Faze     "+ heroicPointFaze + " Heroic");

        if (fazeBool && naviBool){
            int fn = 0, fazePointNavi = 0, naviPointFaze = 0;
            boolean fazeNaviBool = false;
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
                    fazeNaviBool = true;
                    System.out.println("Fazze win");
                    break;
                }else if(naviPointFaze == 16){
                    System.out.println("Navi win");
                    break;
                }else if(fazePointNavi >= 15 && naviPointFaze >= 15){
                    fn -= 6;
                    fazePointNavi -= 3;
                    naviPointFaze -= 3;
                }
            }
            System.out.println("Исход встречи : " + fazePointNavi + " Faze     "+ naviPointFaze + " Navi");

        } else if(!fazeBool && !naviBool){
            int gh = 0, g2PointHeroic = 0, heroicPointG2 = 0;
            boolean heroicG2Bool = false;
            while (gh <= 30) {
                G2 g2 = new G2("G2", (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))));
                Heroic heroic = new Heroic("Heroic", (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))));
                if (g2.totalPower() > heroic.totalPower()) {
                    gh++;
                    g2PointHeroic++;
                    System.out.println("G2 win round");
                } else if (g2.totalPower() < heroic.totalPower()) {
                    gh++;
                    heroicPointG2++;
                    System.out.println("Heroic win round");
                }


                if (g2PointHeroic == 16){
                    heroicG2Bool = true;
                    System.out.println("G2 win");
                    break;
                }else if(heroicPointG2 == 16){
                    System.out.println("Heroic win");
                    break;
                }else if(g2PointHeroic >= 15 && heroicPointG2 >= 15){
                    gh -= 6;
                    g2PointHeroic -= 3;
                    heroicPointG2 -= 3;
                }
            }
            System.out.println("Исход встречи : " + g2PointHeroic + " G2     "+ heroicPointG2 + " Heroic");
        } else if (fazeBool == false && naviBool == true){
            int nh = 0, naviPointHeroic = 0, heroicPointNavi = 0;
            boolean heroicNaviBool = false;
            while (nh <= 30) {
                Navi navi = new Navi("Navi", (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))));
                Heroic heroic = new Heroic("Heroic", (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))));
                if (navi.totalPower() > heroic.totalPower()) {
                    nh++;
                    naviPointHeroic++;
                    System.out.println("Navi win round");
                } else if (navi.totalPower() < heroic.totalPower()) {
                    nh++;
                    heroicPointNavi++;
                    System.out.println("Heroic win round");
                }


                if (naviPointHeroic == 16){
                    heroicNaviBool = true;
                    System.out.println("Navi win");
                    break;
                }else if(heroicPointNavi == 16){
                    System.out.println("Heroic win");
                    break;
                }else if(naviPointHeroic >= 15 && heroicPointNavi >= 15){
                    nh -= 6;
                    naviPointHeroic -= 3;
                    heroicPointNavi -= 3;
                }
            }
            System.out.println("Исход встречи : " + naviPointHeroic + " Navi    "+ heroicPointNavi + " Heroic");
        }else if (fazeBool == true && naviBool == false){
            int gf = 0, fazePointG2 = 0, g2PointFaze = 0;
            boolean fazeG2Bool = false;
            while (gf <= 30) {
                G2 g2 = new G2("G2", (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))));
                Faze faze = new Faze("Faze", (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))), (89 + (int) (Math.random() * ((98 - 89) + 1))));
                if (faze.totalPower() > g2.totalPower()) {
                    gf++;
                    fazePointG2++;
                    System.out.println("Faze win round");
                } else if (faze.totalPower() < g2.totalPower()) {
                    gf++;
                    g2PointFaze++;
                    System.out.println("G2 win round");
                }


                if (fazePointG2 == 16){
                    fazeG2Bool = true;
                    System.out.println("Faze win");
                    break;
                }else if(g2PointFaze == 16){
                    System.out.println("G2 win");
                    break;
                }else if(fazePointG2 >= 15 && g2PointFaze >= 15){
                    gf -= 6;
                    fazePointG2 -= 3;
                    g2PointFaze -= 3;
                }
            }
            System.out.println("Исход встречи : " + fazePointG2  + " Faze    "+ g2PointFaze + " G2");
        }


    }
}
