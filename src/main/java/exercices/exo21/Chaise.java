package exercices.exo21;

public class Chaise {
    // Attributs
    private int nb_pieds;
    private String materiaux;
    private String couleur;
    private double prix;


    public Chaise(int nb_pieds, String materiaux, String couleur, double prix) {
        this.nb_pieds = nb_pieds;
        this.materiaux = materiaux;
        this.couleur = couleur;
        this.prix = prix;

    }

    public int getNb_pieds() {
        return nb_pieds;
    }

    public void setNb_pieds(int nb_pieds) {
        this.nb_pieds = nb_pieds;
    }

    public String getMateriaux() {
        return materiaux;
    }

    public void setMateriaux(String materiaux) {
        this.materiaux = materiaux;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Je suis une chaise avec " + nb_pieds + " pied(s) en " + materiaux + " de couleur " + couleur + " à un prix de " + prix;
    }
}
