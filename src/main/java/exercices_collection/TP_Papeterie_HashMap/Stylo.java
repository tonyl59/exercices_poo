package exercices_collection.TP_Papeterie_HashMap;

public class Stylo extends ArticleUnitaire {
    // Attributs
    private String couleur;
    private static int compte_stylo;

    // Constructeur
    public Stylo(String nom, double prix, String couleur) {
        super( nom, prix);
        compte_stylo ++;
        this.setRef_unique("SY"+compte_stylo); //TODO comment je fais l'incrementation de la reference
        this.couleur = couleur;
        getHashArticle().put(getRef_unique(), this); // ref unique et nom de l'article unitaire
    }


    // Setters & Getters
    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur)
    {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Stylo{" +
                "ref_unique='"+ getRef_unique() + "', " +
                "nom='" + getNom() + "', " +
                "prix='" + getPrix() + "'," +
                "couleur='" + couleur + "'" +
                '}';
    }
}
