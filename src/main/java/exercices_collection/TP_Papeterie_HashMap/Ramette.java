package exercices_collection.TP_Papeterie_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Ramette extends ArticleUnitaire {

    // Attributs
    private double grammage;
    private static int compte_ramette;

    // Constructeur

    public Ramette(String nom, double prix, double grammage) {
        super( nom, prix);
        compte_ramette ++;
        this.setRef_unique("RA"+compte_ramette);
        this.grammage = grammage;
        getHashArticle().put(getRef_unique(), this); // ref_unique et nom de l'article unitaire

    }

    // Setters & Getters

    public double getGrammage() {
        return grammage;
    }

    public void setGrammage(double grammage) {
        this.grammage = grammage;
    }

    // Méthodes

    @Override
    public String toString() {
        return "Ramette{" +
                "ref_unique='"+ getRef_unique() + "', " +
                "nom='" + getNom() + "', " +
                "prix='" + getPrix() + "', " +
                "grammage='" + grammage +
                "'}";
    }
}

