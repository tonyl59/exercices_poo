package exercices_collection.TP_Papeterie_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Ramette extends ArticleUnitaire {

    // Attributs
    double grammage;

    // Constructeur

    public Ramette(int ref_unique, String nom, int prix, double grammage) {
        super(ref_unique, nom, prix);
        this.grammage = grammage;
        getHashArticle().put(getRef_unique(), nom); // ref_unique et nom de l'article unitaire

    }

    // Setters & Getters

    public double getGrammage() {
        return grammage;
    }

    public void setGrammage(double grammage) {
        this.grammage = grammage;
    }
}
