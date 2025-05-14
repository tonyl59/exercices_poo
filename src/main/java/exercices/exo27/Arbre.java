package exercices.exo27;



public class Arbre extends Plante {

    // Attribut exclusif à la plante
    private double circonf_tronc;

    public Arbre(String nom, double hauteur, String couleur, double circonf_tronc) {
        super(nom, hauteur, couleur);
        this.circonf_tronc = circonf_tronc;
    }

    // Méthode
    @Override
    public String affichage_info() {
        return super.affichage_info()+String.format(" Aussi, la circonférence de son tronc est de %s cm.", circonf_tronc);
    }
}

//    public void crier(){
//        super.crier();
//        System.out.println("Le chien aboie !!!");
//    }
//
//    @Override
//    public String toString(){
//        return super.toString() + " est un chien de race "+this.race;
//    }
//
//}