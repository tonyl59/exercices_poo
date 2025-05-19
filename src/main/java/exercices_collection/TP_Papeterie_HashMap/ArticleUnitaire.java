package exercices_collection.TP_Papeterie_HashMap;

public abstract class ArticleUnitaire extends Article {

    // Attribut
    private String nom;
    private double prix;

    // Constructors

    public ArticleUnitaire(String nom, double prix) {
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

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}

