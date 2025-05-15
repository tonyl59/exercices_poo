package exercices_classe.exo23;

public class Joueur {

    //Attributs

    private String nom;
    private int niveau;
    private int exp;
    private int nb_quetes;

    //Constructeur
    public Joueur(String nom, int niveau, int exp) {
        this.nom = nom;
        this.niveau = niveau;
        this.exp = exp;
    }

    // Getters & Setters
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
        nb_quetes++;
    }

    // Méthodes
    public void niveausup() {
        if (exp >= 100) {
            niveau ++;
            exp = exp - 100;

        }
    }

    public void chgmt_nom(String nouveau_nom){
        nom = nouveau_nom;
        System.out.println(String.format("Le joueur %s a changé son nom en %s !", nom, nouveau_nom));
    }


    @Override
    public String toString() {
        return String.format("Le joueur %s est niveau %s avec %s points d'expérience à la quete n°%s", nom, niveau, exp, nb_quetes);
    }
}
