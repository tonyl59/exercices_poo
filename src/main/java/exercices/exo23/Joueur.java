package exercices.exo23;

public class Joueur {

    //Attributs

    private String nom;
    private int niveau;
    private int exp;

    //Constructeur
    public Joueur(String nom, int niveau, int exp) {
        this.nom = nom;
        this.niveau = niveau;
        this.exp = exp;
    }

    // Méthodes
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void UneQuete() {
        exp = exp + 10;
    }

    public void niveausup() {
        if (exp >= 100) {
            niveau = niveau + 1;
            exp = exp - 100;


        }
    }

    @Override
    public String toString() {
        return String.format("Le joueur %s est niveau %s avec %s points d'expérience", nom, niveau, exp);
    }
}
