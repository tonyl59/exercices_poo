package exercices_classe.exo25;

public class Main {
    public static void main(String[] args) {
        WaterTank tank1 = new WaterTank(100,10,150);
        WaterTank tank2 = new WaterTank(110,25,170);
        System.out.println("tank1 "+tank1.getVol_initial());
        System.out.println("tank2 "+tank2.getVol_initial());
        tank2.getVol_initial();
        System.out.println(WaterTank.getTotal_eau());

        tank1.remplir(15);
        tank2.vider(30); // ici pas possible donc annulé
        tank2.vider(10);
        System.out.println(WaterTank.getTotal_eau());

        System.out.println("tank1"+tank1.getPoids());
        System.out.println("tank2"+tank2.getPoids());

        WaterTank tank3 = new WaterTank(110,60,50);
        System.out.println(tank3.getVol_initial()); // Met les attributs à 0 plutot que de ne pas créer





    }
}
