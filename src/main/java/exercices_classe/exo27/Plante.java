package exercices_classe.exo27;

public class Plante {

    // Attributs
    private String nom;
    private double hauteur;
    private String couleur;

    //Constructeur
    public Plante(String nom, double hauteur, String couleur) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleur = couleur;
    }

    // Setters & Getters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    // Méthodes
    @Override
    public String toString() {
        return String.format("Cette plante est un(e) %s, d'une hauteur de %s et de couleur %S", nom, hauteur, couleur);
    }

    public String affichage_info(){
        return String.format("Cette plante est un(e) %s, d'une hauteur de %s et de couleur %s.", nom, hauteur, couleur);

    }


}
