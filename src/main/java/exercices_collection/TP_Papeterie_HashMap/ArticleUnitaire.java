package exercices_collection.TP_Papeterie_HashMap;

public class ArticleUnitaire extends Article {

    // Attribut
    private String nom;
    private int prix;

    // Constructors

    public ArticleUnitaire(int ref_unique, String nom, int prix) {
        super();
        this.nom = nom;
        this.prix = prix;
    };

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}

