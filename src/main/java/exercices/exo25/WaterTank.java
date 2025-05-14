package exercices.exo25;
// ici faut faire un statique
public class WaterTank {
    // Attributs
    private double poids;
    private double vol_max;
    private double vol_initial;

    // Attributs de classes (static)
    private double nv_remplissage;
    private static double total_eau;


    // Constructeur

    public WaterTank(double poids, double vol_initial, double vol_max) {
        if (vol_initial<0){
            System.out.println("Impossible d'avoir un volume initial en-dessous de 0!");
        }else if(vol_initial>vol_max){
            System.out.println("Impossible d'avoir un volume initial au-dessus de la capacité maximale!");
        }else{
            this.poids = poids;
            this.vol_max = vol_max;
            this.vol_initial = vol_initial;
            nv_remplissage = vol_initial;
            total_eau += vol_initial;
        }
    }


    // Getters & Setters


    public String getPoids() {
        return String.format("Poids à vide de la citerne : %s",poids);
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getCap_max() {
        return vol_max;
    }

    public void setCap_max(double cap_max) {
        this.vol_max = cap_max;
    }

    public String getVol_initial() {
        return String.format("volume de départ %s",vol_initial);
    }

    public void setVol_initial(double vol_initial) {
        if (vol_initial > vol_max){
            System.out.println("Le volume initial ne peut pas être supérieure à la capacité maximale !");
        }else if(vol_initial<0){
            System.out.println("Impossible d'avoir un volume initial négatif !");
        }else{
            this.vol_initial = vol_initial;
        }

    }

    public double getNv_remplissage() {
        return nv_remplissage;
    }

    public void setNv_remplissage(double nv_remplissage) {
        this.nv_remplissage = nv_remplissage;
    }

    public static String getTotal_eau() {
        return String.format("Volume total des WaterTank : %s", total_eau);
    }

    public static void setTotal_eau(double total_eau) {
        WaterTank.total_eau = total_eau;
    }


    //Méthodes
    public void remplir(double volume) {
        if (volume<0){
            System.out.println("Impossible d'ajouter un volume négatif");
        }
        else if (nv_remplissage+volume > vol_max) {
            System.out.println("Impossible de remplir au-dessus de la capacité maximale !");
        } else {
            nv_remplissage = nv_remplissage + volume;
            total_eau += volume;
        }
    }

    public void vider(double volume) {
        if (volume <0){
            System.out.println("Impossible de retirer un volume négatif !");
        }
        else if (nv_remplissage-volume < 0){
            System.out.println("Impossible de vider à un volume négatif !");
        }else {
            nv_remplissage = nv_remplissage - volume;
            total_eau -= volume;
        }
    }
}
