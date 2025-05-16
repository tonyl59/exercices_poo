package exercices_collection.TP_Papeterie_HashMap;

public class Stylo extends ArticleUnitaire {
    // Attributs
    private String couleur;

    // Constructeur
    public Stylo(int ref_unique, String nom, int prix, String couleur) {
        super(ref_unique, nom, prix);
        this.couleur = couleur;
        getHashArticle().put(getRef_unique(), nom); // ref unique et nom de l'article unitaire
    }


    // Setters & Getters
    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
